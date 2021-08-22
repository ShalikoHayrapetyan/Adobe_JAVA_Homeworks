package com.company.week_4.task_2;

public class Main {
    public static void main(String[] args) {
        ImmutablePoint immutablePoint1 = new ImmutablePoint(3,4);
        ImmutablePoint immutablePoint2 = new ImmutablePoint(1.1,2.3);
        ImmutablePoint immutablePoint3 = new ImmutablePoint(immutablePoint1);
        System.out.println(immutablePoint1);
        System.out.println(immutablePoint2);
        System.out.println(immutablePoint3);
    }
}
