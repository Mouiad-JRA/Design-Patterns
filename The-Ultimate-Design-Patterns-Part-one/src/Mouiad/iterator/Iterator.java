package Mouiad.iterator;

public interface Iterator<T> {
    void next();
    T  current();
    Boolean hasNext();
}
