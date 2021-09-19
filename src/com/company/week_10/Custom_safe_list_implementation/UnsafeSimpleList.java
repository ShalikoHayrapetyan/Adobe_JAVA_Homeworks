package com.company.week_10.Custom_safe_list_implementation;

import java.util.ArrayList;
import java.util.List;

public class UnsafeSimpleList<T> implements SimpleList<T> {
    List<T> list = new ArrayList<>();

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }
}
