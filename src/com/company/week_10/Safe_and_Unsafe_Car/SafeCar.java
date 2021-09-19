package com.company.week_10.Safe_and_Unsafe_Car;


import java.util.ArrayList;
import java.util.List;

public class SafeCar implements Car {
    String[] list = new String[6];
    int index = 0;

    @Override
    public synchronized void add(String passengerName) {
        if (list.length >= 6) {
            new RuntimeException("Car is full");
        }
        list[index] = passengerName;
        index++;


    }

    @Override
    public synchronized void printPassangerNames() {
        String string = "";
        for (int i = 0; i < list.length; i++) {
            string += list[i] + ", ";
        }
        System.out.println("Safe Car -  "+ string);
    }
}
