package com.company.week_3.Static_Fields;

public class Laptop {
    int value;
    private static int countPublic = 0;
    private static int countProtected = 0;


    public Laptop() {
        countPublic++;
        System.out.println("Public Laptops count = " + countPublic);

    }

    protected Laptop(int val) {
        countProtected++;
        System.out.println("Protected Laptops count = " + countProtected);
    }
}
