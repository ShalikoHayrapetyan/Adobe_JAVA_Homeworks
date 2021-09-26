package com.company.week_11.List_and_Set_assertion;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> objects = new LinkedList();
        CheckSize checkSize = new CheckSize(3, objects);

        objects.add(12);
        objects.add(15);
        objects.add(17);

        checkSize.checkSize();
        objects.add(20);
        checkSize.checkSize();

    }
}
