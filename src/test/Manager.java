package test;

public interface Manager<T> {
    void add(T t);
    void update(int index,T t);
}
