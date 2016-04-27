
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import models.*;
import play.mvc.Controller;
import play.mvc.Result;
import util.Common;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.lang.reflect.Modifier;
import java.util.*;


@Named
@Singleton
public class GroupUsersController extends Controller {


    private final GroupUsersRepository groupUsersRepository;
    private final UserRepository userRepository;
    private final GroupRequestorRepository groupRequestorRepository;

    @Inject
    public GroupUsersController(final GroupUsersRepository groupUsersRepository,
                                UserRepository userRepository,GroupRequestorRepository groupRequestorRepository) {
        this.groupUsersRepository = groupUsersRepository;
        this.userRepository = userRepository;
        this.groupRequestorRepository=groupRequestorRepository;
    }

    //post create group
    public Result createGroup() {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("group not created, expecting Json data");
            return Common.badRequestWrapper("group not created, expecting Json data");
        }

        long userID = json.path("userID").asLong();
        String groupName = json.path("groupName").asText();
        String groupDescription = json.path("groupDescription").asText();

        User user = userRepository.findOne(userID);
        System.out.println("user is " + user);
        List<User> groupMembers = new ArrayList<User>();
        groupMembers.add(user);

        GroupUsers group = new GroupUsers(userID, groupName, groupDescription, groupMembers);
        System.out.println("group is " + group);
        groupUsersRepository.save(group);

        return created(new Gson().toJson(group.getGroupUrl()));
    }

    //post
    public Result addMembersToGroup() {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("group not created, expecting Json data");
            return Common.badRequestWrapper("group not created, expecting Json data");
        }

        String groupUrl = json.path("groupUrl").asText();
        long userID = json.path("userID").asLong();

        User user = userRepository.findOne(userID);
        List<GroupUsers> groups = groupUsersRepository.findByGroupUrl(groupUrl);
        if(groups.size() == 0) {
            return Common.badRequestWrapper("Failed to add member!");
        }
        else {
            GroupUsers group = groups.get(0);
            group.getGroupMembers().add(user);
            groupUsersRepository.save(group);

            return created(new Gson().toJson("success"));
        }
    }

    //get
    public Result getGroupList(Long userID, String format) {
        if (userID == null) {
            System.out.println("user id is null or empty!");
            return Common.badRequestWrapper("user id is null or empty!");
        }

        List<GroupUsers> groups = groupUsersRepository.findByUserId(userID);
        if (groups == null) {
            System.out.println("The group does not exist!");
            return Common.badRequestWrapper("The group does not exist!");
        }

        for (GroupUsers group: groups) {
            for (int i=0; i<group.getGroupMembers().size(); i++) {
                Set<User> empty = new HashSet<>();
                group.getGroupMembers().get(i).setFollowers(empty);
                group.getGroupMembers().get(i).setFriends(empty);
            }
        }
        String result = new String();
        if (format.equals("json")) {
            result = new GsonBuilder().excludeFieldsWithModifiers(Modifier.PROTECTED).create().toJson(groups);
        }

        return ok(result);
    }

    //get
    public Result getGroupMember(Long groupId, String format) {
        if(groupId == null) {
            System.out.println("Id not created, please enter valid user");
            return Common.badRequestWrapper("Id not created, please enter valid user");
        }

        GroupUsers group = groupUsersRepository.findById(groupId);
        List<User> groupMembers = group.getGroupMembers();
        for(User groupMember: groupMembers) {
            groupMember.setPassword("******");
        }

        String result = new String();
        if (format.equals("json")) {
            result = new GsonBuilder().excludeFieldsWithModifiers(Modifier.PROTECTED).create().toJson(groupMembers);
        }

        return ok(result);
    }

    //post
    public Result sendJoinRequest() {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("group not created, expecting Json data");
            return Common.badRequestWrapper("group not created, expecting Json data");
        }

        String groupUrl = json.path("groupUrl").asText();
        long userID = json.path("userID").asLong();

        User user = userRepository.findOne(userID);
        List<GroupUsers> groups = groupUsersRepository.findByGroupUrl(groupUrl);
        if(groups.size() == 0) {
            return Common.badRequestWrapper("Failed to add member!");
        }
        else {
            GroupUsers group = groups.get(0);
            sendJoinGroupRequest(userID,group.getCreatorUser(),groupUrl);
            groupUsersRepository.save(group);
            return created(new Gson().toJson("success"));
        }
    }


    public Result sendJoinGroupRequest(Long senderId, Long receiverId,String groupUrl) {
        try {
            if(receiverId==null){
                System.out.println("User id is null or empty!");
                return badResponse("User id is null or empty");
            }
            User receiver = userRepository.findOne(receiverId);
            if(receiverId==null){
                System.out.println("Cannot find friend request sender");
                return badResponse("Cannot find friend request sender");
            }

            if(senderId==null){
                System.out.println("User id is null or empty!");
                return badResponse("User id is null or empty");
            }
            User sender = userRepository.findOne(senderId);
            if(receiverId==null){
                System.out.println("Cannot find friend request sender");
                return badResponse("Cannot find friend request sender");
            }

            Set<GroupRequestor> senders = receiver.getJoinGroupRequestSender();
            System.out.println("----------------------->senders' size:"+senders.size());
            GroupRequestor requestor=new GroupRequestor();
            requestor.setGroupUrl(groupUrl);
            requestor.setSenderId(senderId);
            System.out.println("----------------------->requestor: "+requestor.toString());
            senders.add(requestor);
            receiver.setJoinGroupRequestSender(senders);
            System.out.println("----------------------->senders' size after:"+senders.size());
            groupRequestorRepository.save(requestor);
            userRepository.save(receiver);
            return okResponse("Join Group Request is sent");

        } catch (Exception e){
            e.printStackTrace();
            return badResponse("Cannot send Join Group request");
        }
    }

    public Result getJoinGroupRequests(Long id) {
        try{
            if(id==null){
                System.out.println("User id is null or empty!");
                return badResponse("User id is null or empty");
            }
            User user = userRepository.findOne(id);
            if(user==null){
                System.out.println("Cannot find user");
                return badResponse("Cannot find user");
            }
            Set<GroupRequestor> sendergroups = user.getJoinGroupRequestSender();
            Map<String,List<User>> sendergroupMap=new HashMap<String,List<User>>();
            for(GroupRequestor sendergroup:sendergroups){
                Long senderId=sendergroup.getSenderId();
                String groupUrl=sendergroup.getGroupUrl();
                User sender = userRepository.findOne(senderId);
                List<User> joinSenders=new ArrayList<User>();
                if(sendergroupMap.containsKey(groupUrl)){
                    joinSenders=sendergroupMap.get(groupUrl);
                }
                joinSenders.add(sender);
                sendergroupMap.put(groupUrl,joinSenders);
            }

            StringBuilder sb = new StringBuilder();
            sb.append("{\"JoinGroupRequestSender\":");
            if(!sendergroups.isEmpty()) {
                sb.append("[");
                for(Map.Entry<String,List<User>> entry:sendergroupMap.entrySet()){
                    sb.append("{\"groupUrl\":\""+entry.getKey()+"\",\"senders\":[");
                    List<User> senders=entry.getValue();
                    for (User sender : senders) {
                        sb.append(sender.toJson() + ",");
                    }
                    if (senders.size()>0) {
                        sb.deleteCharAt(sb.lastIndexOf(","));
                    }
                    sb.append("]},");
                }
                if(sendergroupMap.size()>0){
                    sb.deleteCharAt(sb.lastIndexOf(","));
                }
                sb.append("]}");
            } else {
                sb.append("{}}");
            }
            return ok(sb.toString());
        } catch (Exception e){
            e.printStackTrace();
            return badResponse("Cannot get friend-requests");
        }
    }

    public Result acceptJoinRequest(String groupUrl,Long receiverId, Long senderId) {
        try {
            System.out.println("----------------------->acceptJoinRequest being called");
            if(receiverId==null){
                System.out.println("User id is null or empty!");
                return badResponse("User id is null or empty");
            }
            User receiver = userRepository.findOne(receiverId);
            if(receiverId==null){
                System.out.println("Cannot find friend accept receiver");
                return badResponse("Cannot find friend accept receiver");
            }

            if(senderId==null){
                System.out.println("User id is null or empty!");
                return badResponse("User id is null or empty");
            }
            User sender = userRepository.findOne(senderId);
            if(senderId==null){
                System.out.println("Cannot find friend accept sender");
                return badResponse("Cannot find friend accept sender");
            }
            System.out.println("----------------------->groupUrl:"+groupUrl);
            System.out.println("----------------------->senderId:"+senderId);
            Set<GroupRequestor> reqSenders = receiver.getJoinGroupRequestSender();
            boolean flag = false;
            for(GroupRequestor reqSender : reqSenders) {
                if(reqSender.getSenderId()==senderId){
                    System.out.println("----------------------->id matches.");
                    if(reqSender.getGroupUrl().equals(groupUrl)){
                        System.out.println("----------------------->groupUrl matches.");
                        flag = true;
                        reqSenders.remove(reqSender);
                        break;
                    }
                }

//                if((reqSender.getSenderId()==senderId) && (reqSender.getGroupUrl().equals(groupUrl))){
//                    flag = true;
//                    reqSenders.remove(reqSender);
//                }
            }
            if(flag == false) {
                System.out.println("Join Group Request doesn't exist");
                return badResponse("Join Group Request doesn't exist");
            }

            receiver.setJoinGroupRequestSender(reqSenders);

            List<GroupUsers> groups = groupUsersRepository.findByGroupUrl(groupUrl);
            if(groups.size() == 0) {
                return Common.badRequestWrapper("Failed to add a new member!");
            }
            else {
                GroupUsers group = groups.get(0);
                group.getGroupMembers().add(sender);
                groupUsersRepository.save(group);
                userRepository.save(receiver);
                userRepository.save(sender);
//                groupRequestorRepository.save(reqSenders);
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("success", "Success");

                return ok(new Gson().toJson(jsonObject));
            }


        } catch (Exception e){
            e.printStackTrace();
            return badResponse("Cannot add a new member!");
        }

    }

    public Result rejectJoinRequest(String groupUrl,Long receiverId, Long senderId) {
        try {
            if(receiverId==null){
                System.out.println("User id is null or empty!");
                return badResponse("User id is null or empty");
            }
            User receiver = userRepository.findOne(receiverId);
            if(receiverId==null){
                System.out.println("Cannot find friend accept receiver");
                return badResponse("Cannot find friend accept receiver");
            }

            if(senderId==null){
                System.out.println("User id is null or empty!");
                return badResponse("User id is null or empty");
            }
            User sender = userRepository.findOne(senderId);
            if(receiverId==null){
                System.out.println("Cannot find friend accept sender");
                return badResponse("Cannot find friend accept sender");
            }

            Set<GroupRequestor> reqSenders = receiver.getJoinGroupRequestSender();
            boolean flag = false;
            for(GroupRequestor reqSenderGroupstr : reqSenders) {
                if((reqSenderGroupstr.getSenderId()==senderId) && (reqSenderGroupstr.getGroupUrl().equals(groupUrl))){
                    flag = true;
                    reqSenders.remove(reqSenderGroupstr);
                }
            }
            if(flag == false) {
                System.out.println("Join Group Request doesn't exist");
                return badResponse("Join Group Request doesn't exist");
            }
            receiver.setJoinGroupRequestSender(reqSenders);

            userRepository.save(receiver);
//            groupRequestorRepository.save(reqSenders);
            return okResponse("Join Group request is rejected!");
        } catch (Exception e){
            e.printStackTrace();
            return badResponse("Cannot join the group");
        }
    }

    public Result okResponse(String message) {
        Map<String, String> map = new HashMap<>();
        map.put("success", message);
        String result = new Gson().toJson(map);
        return ok(result);
    }

    public Result badResponse(String message) {
        Map<String, String> map = new HashMap<>();
        map.put("Error", message);
        String result = new Gson().toJson(map);
        return ok(result);
    }
}