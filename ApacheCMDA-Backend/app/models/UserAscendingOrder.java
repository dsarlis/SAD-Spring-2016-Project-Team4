package models;

import java.util.Collections;
import java.util.List;

public class UserAscendingOrder implements Strategy<User> {

    @Override
    public void sort(List<User> objects) {
        Collections.sort(objects);
    }
}
