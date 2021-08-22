package com.company.week_4.task_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Write a numver (1 or 2)");
        int number = new Scanner(System.in).nextInt();
        Clock clock = new Clock(number);

    }

}
