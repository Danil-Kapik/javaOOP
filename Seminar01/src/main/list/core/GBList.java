package main.list.core;

public interface GBList<T> extends Iterable<T> {
    void addFirst(T elem);

    void add(T elem);
    void remove(int index);
    T get(int index);
    int size();
}