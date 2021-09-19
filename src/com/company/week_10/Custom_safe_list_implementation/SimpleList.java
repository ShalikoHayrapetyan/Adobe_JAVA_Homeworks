package com.company.week_10.Custom_safe_list_implementation;

public interface SimpleList<T> {
    void add(T item);

    int getSize();

    T get(int index);
}
