package controllers;

import models.User;

import java.util.List;

/**
 * Created by Na on 4/19/16.
 */
public interface ProfileInterface {
    public static enum FollowType {
        FOLLOWEE, FOLLOWER
    }

    List<User> getFollow(Long id, FollowType f);

    List<User> getFriends(Long id);
}
