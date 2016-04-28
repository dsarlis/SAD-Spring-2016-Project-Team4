package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.User;
import util.APICall;
import util.APICallAdapter;
import util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Na on 4/19/16.
 */
public class Friend implements ProfileInterface {
    private static final APICallAdapter adapter = APICallAdapter.getAPICallAdapter();

    @Override
    public List<User> getFriends(Long id) {
        String queryApi = Constants.NEW_BACKEND
                + "users/getFriends/userId/" + id.toString();
        JsonNode response = adapter.callAPI(queryApi);
        if (response.has("error"))
            return new ArrayList<User>();
        List<User> result = new ArrayList<User>();
        if (response.get("friends")==null) return result;
        for (JsonNode entityn: response.get("friends")) {
            JsonNode entity = entityn.get("User");
            User u = new User();
            u.setId(Long.parseLong(entity.get("id").textValue()));
            u.setUserName(entity.get("userName").textValue());
            u.setAvatar(entity.get("avatar").textValue());
            result.add(u);
        }
        return result;
    }

    @Override
    public List<User> getFollow(Long id, FollowType f) {
        return null;
    }
}
