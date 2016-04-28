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
public class Follow implements ProfileInterface {
    private static final APICallAdapter adapter = APICallAdapter.getAPICallAdapter();

    @Override
    public List<User> getFollow(Long id, FollowType f) {
        String queryApi = Constants.NEW_BACKEND
                + (f == FollowType.FOLLOWEE ?
                "users/getFollowees/" : "users/getFollowers/")
                + id.toString();
        JsonNode response = adapter.callAPI(queryApi);
        if (response.has("error"))
            return new ArrayList<User>();
        List<User> result = new ArrayList<User>();
        String key = (f == FollowType.FOLLOWEE ? "followees" : "followers");
        JsonNode arr = response.get(key);
        for (JsonNode entity: arr) {
            User u = new User();
            JsonNode user = entity.get("User");
            u.setId(Long.parseLong(user.get("id").textValue()));
            u.setUserName(user.get("userName").textValue());
            u.setEmail(user.get("email").textValue());
            u.setAvatar(user.get("avatar").textValue());
            result.add(u);
        }
        return result;
    }

    @Override
    public List<User> getFriends(Long id) {
        return null;
    }
}
