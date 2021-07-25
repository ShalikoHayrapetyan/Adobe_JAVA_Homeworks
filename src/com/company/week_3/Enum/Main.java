package com.company.week_3.Enum;

public class Main {

    public static void main(String[] args) {
        printValOfEnum();
        System.out.println(Months.getMonth(2));
    }

    public static void printValOfEnum() {
        for (Enumeration value : Enumeration.values()) {
            System.out.println(value);
        }
    }
}
