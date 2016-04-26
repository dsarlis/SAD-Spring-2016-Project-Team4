package models;

import java.util.Collections;
import java.util.List;

public class UserDescendingOrder<User> implements Strategy<User> {

    @Override
    public void sort(List<User> objects) {
        Collections.reverse(objects);
    }
}
