package com.company.week_4.task_1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("anun1", "azganun1", "user1", "user1@gmail.com");
        User user2 = new User(user1);
        User user3 = user1.copy();
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        UserGroup userGroup1 = new UserGroup();
        userGroup1.addUser(user1);
        userGroup1.addUser(new User("anun2", "azganun2", "user2", "user2@gmail.com"));
        System.out.println(userGroup1);
        System.out.println(userGroup1.clone());

    }
}
