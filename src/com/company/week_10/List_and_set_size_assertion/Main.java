package com.company.week_10.List_and_set_size_assertion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "user1");
        User user2 = new User(2, "user2");
        User user3 = new User(3, "user3");
        User user4 = new User(2, "user2");
        User user5 = new User(2, "user2");

        ArrayList<User> users1 = new ArrayList<>();
        users1.add(user1);
        users1.add(user2);
        users1.add(user3);
        users1.add(user4);
        users1.add(user5);

        System.out.println("Array List size is " + users1.size());


        LinkedList<User> users2 = new LinkedList<>();
        for (User user : users1) {
            users2.add(user);
        }
        System.out.println("Linked List size is " + users2.size());

        HashSet<User> users3 = new HashSet<>();
        for (User user : users1) {
            users3.add(user);
        }

        System.out.println("HashSet  size is " + users3.size());

        TreeSet<User> users4 = new TreeSet<>();
        for (User user : users1) {
            users4.add(user);
        }

        System.out.println("TreeSet size is " + users4.size());
    }
}
