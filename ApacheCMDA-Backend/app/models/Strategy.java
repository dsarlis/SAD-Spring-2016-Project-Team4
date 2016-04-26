package models;

import java.util.List;

public interface Strategy<T> {
    void sort(List<T> objects);
}
