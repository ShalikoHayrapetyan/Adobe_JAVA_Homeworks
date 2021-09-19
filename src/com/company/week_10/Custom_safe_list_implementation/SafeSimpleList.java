package com.company.week_10.Custom_safe_list_implementation;

import java.util.ArrayList;
import java.util.List;

public class SafeSimpleList<T> implements SimpleList<T> {
    List<T> list = new ArrayList<>();

    @Override
    public synchronized void add(T item) {
        list.add(item);
    }

    @Override
    public synchronized int getSize() {
        return list.size();
    }

    @Override
    public synchronized T get(int index) {
        return list.get(index);
    }

}
