package com.company.week_4.task_3;

import com.company.week_4.task_1.User;
import com.company.week_4.task_1.UserGroup;
import com.company.week_4.task_2.*;

public class Printer {
    public static void specialPrint(Object obj) {
        System.out.println("**********************");
        System.out.println(obj.toString());
        System.out.println("**********************");
    }

    public static void main(String[] args) {
        User user1 = new User("Shaliko", "Hayrapetyan", "shaliko96", "hayrapetyanshaliko@gmail.com");
        User user2 = new User("name1", "surname2", "username1", "user1@gmail.com");

        UserGroup userGroup = new UserGroup();
        userGroup.addUser(user1);
        userGroup.addUser(user2);

        Point p1 = new ImmutablePoint(5, 6);
        Point p2 = new ImmutablePoint(8, 7);
        Point p3 = new ImmutablePoint(10, 9);
        Triangle triangle = new Triangle(p1, p2, p3);
        ColoredTriangle coloredTriangle = new ColoredTriangle(triangle, Color.BLACK);

        Printer.specialPrint(user1);
        Printer.specialPrint(userGroup);
        Printer.specialPrint(p1);
        Printer.specialPrint(triangle);
        Printer.specialPrint(coloredTriangle);
    }
}
