package controllers;

import models.User;

import java.util.List;

/**
 * Created by Na on 4/19/16.
 */
public class ProfileFactory {
    public ProfileInterface getProfile(String profileType) {
        if (profileType.equals("follow")) {
            return new Follow();
        }

        if (profileType.equals("friend")) {
            return new Friend();
        }

        return null;
    }
}
