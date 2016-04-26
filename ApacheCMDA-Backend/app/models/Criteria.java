package models;

import java.util.List;

public interface Criteria<T> {
    public List<T> meetCriteria(List<T> objects);
}
