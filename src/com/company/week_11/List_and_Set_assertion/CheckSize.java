package com.company.week_11.List_and_Set_assertion;

import java.util.Collection;

public class CheckSize<T extends Collection> {

    private final int size;
    private final T data;

    public CheckSize(int size, T data) {
        this.size = size;
        this.data = data;
    }

    public void checkSize() {
        if (data.size() != size) throw new RuntimeException("the data size not equal to size");
        System.out.println("The data size equal to size");
    }

}
