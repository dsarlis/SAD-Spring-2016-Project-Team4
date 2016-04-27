package controllers;

/**
 * Created by stain on 12/3/2015.
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Group;
import play.api.mvc.Controller;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.JsonNode;
import models.SearchResult;
import models.Workflow;
import play.api.mvc.*;
import play.data.Form;
import play.mvc.Result;
import util.APICallAdapter;
import util.APICall;
import util.Constants;
import views.html.*;
import java.util.ArrayList;
import models.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class GroupController extends play.mvc.Controller {
    private static final APICallAdapter adapter = APICallAdapter.getAPICallAdapter();

    public static class GroupForm
    {
        public String title;
        public String linkstring;
        public GroupForm(){

        }
    }
    final static Form<GroupForm> f_group = Form.form(GroupForm.class);

    public static Result main(){
        Map<String,List<User>> requests = new HashMap<String,List<User>>();
        requests=getJoinGroupRequests();
        return ok(group.render(session("username"), Long.parseLong(session("id")),requests));

    }

    public static Result create()
    {
        JsonNode response = adapter.callAPI(Constants.NEW_BACKEND + "group/getGroupList/" + session("id") + "/json");
        ArrayList<Group> groupArr = new ArrayList<Group>();
        for (JsonNode n: response) {
            Group g = new Group(n);
            groupArr.add(g);
        }
        return ok(create_group.render(session("username"), Long.parseLong(session("id")), groupArr));
    }

    public static Result join()
    {
        return ok(join_group.render(session("username"), Long.parseLong(session("id"))));
    }

    public static Result createGroup()
    {
        Form<GroupForm> form = f_group.bindFromRequest();
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode jnode = mapper.createObjectNode();

        jnode.put("userID", session("id"));
        jnode.put("groupName", form.field("groupName").value());
        jnode.put("groupDescription", form.field("groupDescription").value());

        JsonNode res = adapter.postAPI(Constants.NEW_BACKEND + "group/createGroup", jnode);
        if (res.has("error")) {
            if (res == null)
                flash("error", "no respond");
            else
                flash("failed", res.get("error").textValue());
            return redirect(routes.GroupController.create());
        }
        String pass = res.textValue();
        flash("linkstring", pass);
        JsonNode response = adapter.callAPI(Constants.NEW_BACKEND + "group/getGroupList/" + session("id") + "/json");
        ArrayList<Group> groupArr = new ArrayList<Group>();
        for (JsonNode n: response) {
            Group g = new Group(n);
            groupArr.add(g);
        }
        return ok(create_group.render(session("username"), Long.parseLong(session("id")), groupArr));
    }

    public static Result joinGroup()
    {
        Form<GroupForm> form = f_group.bindFromRequest();

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode jnode = mapper.createObjectNode();

        jnode.put("userID", session("id"));
        jnode.put("groupUrl", form.field("groupUrl").value());

        JsonNode res = adapter.postAPI(Constants.NEW_BACKEND + "group/addMembersToGroup", jnode);
        if (res.has("error")) {
            if (res == null)
                flash("error", "no respond");
            else
                flash("failed", "Invalid Code");
            return redirect(routes.GroupController.join());
        }
        flash("success", "You have joined the group with your code!");
        return ok(join_group.render(session("username"), Long.parseLong(session("id"))));
    }



    public static Result joinGroupRequest()
    {
        Form<GroupForm> form = f_group.bindFromRequest();

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode jnode = mapper.createObjectNode();

        jnode.put("userID", session("id"));
        jnode.put("groupUrl", form.field("groupUrl").value());

        JsonNode res = adapter.postAPI(Constants.NEW_BACKEND + "group/sendJoinRequest", jnode);
        if (res.has("error")) {
            if (res == null)
                flash("error", "no respond");
            else
                flash("failed", "Invalid Code");
            return redirect(routes.GroupController.join());
        }
        flash("success", "You have sent a request to join the group!");
        return ok(join_group.render(session("username"), Long.parseLong(session("id"))));
    }

    public static Map<String,List<User>> getJoinGroupRequests(){
        JsonNode response = adapter.callAPI(Constants.NEW_BACKEND + "group/getJoinGroupRequests/userId/" + session("id"));
        Map<String,List<User>> requests=new HashMap<String,List<User>>();
        if (response == null || !response.has("JoinGroupRequestSender"))
        {
            flash("error", "No response from server!");
            return requests;
        }
        if(response.has("JoinGroupRequestSender")){
            System.out.println("HAS: JoinGroupRequestSender");
        }
        for(JsonNode groupSenderNode:response.get("JoinGroupRequestSender")){
            String groupUrl=groupSenderNode.get("groupUrl").textValue();
            System.out.println(groupUrl);
            List<User> senders=new ArrayList<User>();
            for (JsonNode ni : groupSenderNode.get("senders") )
            {
                User obj = new User();
                JsonNode n = ni.get("User");
                obj.setUserName(n.get("userName").textValue());
                try {
                    obj.setEmail(n.get("email").textValue());
                } catch (Exception e){
                    obj.setEmail("");
                }
                obj.setAvatar(n.get("avatar").textValue());
                obj.setId(Long.parseLong(n.get("id").textValue()));
                senders.add(obj);
            }
            requests.put(groupUrl,senders);
        }
        return requests;
    }

    public static Result acceptMember(String groupUrl,Long id)
    {
        System.out.println("----------------------->acceptJoinRequest being called");
        String requestStr = Constants.NEW_BACKEND + "group/acceptJoinRequest/groupUrl/"+groupUrl+"/userId/"+session("id") + "/sender/" + id.toString();
        JsonNode response = adapter.callAPI(requestStr);
        if (response == null || response.has("error")) {
            flash("error", response.get("error").textValue());
            return redirect(routes.GroupController.main());
        }
        flash("success", "You have accepted the join group request!");
        return redirect(routes.GroupController.main());
    }

    public static Result rejectMember(String groupUrl,Long id)
    {
        String requestStr = Constants.NEW_BACKEND + "group/rejectJoinRequest/groupUrl/"+groupUrl+"/userId/"+session("id") + "/sender/" + id.toString();
        JsonNode response = adapter.callAPI(requestStr);
        if (response == null || response.has("error")) {
            flash("error", response.get("error").textValue());
            return redirect(routes.GroupController.main());
        }
        flash("success", "You have rejected the join group request!");
        return redirect(routes.GroupController.main());
    }

}

