package models;

import java.util.ArrayList;
import java.util.List;

public class CriteriaUsernameMatch implements Criteria<User> {
    private String name;

    public CriteriaUsernameMatch(String name) {
        this.name = name.toLowerCase();
    }

    @Override
    public List<User> meetCriteria(List<User> objects) {
        List<User> users = new ArrayList<>();
        for (User user: objects) {
            if (user.getUserName() != null && user.getUserName().toLowerCase().contains(name)) {
                users.add(user);
            }
        }
        return users;
    }
}
