package com.company.week_10.Safe_and_Unsafe_Car;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UnsafeCar implements Car {
    String[] list = new String[6];
    int index = 0;


    @Override
    public void add(String passengerName) {
        list[index] = passengerName;
        index++;
    }

    @Override
    public void printPassangerNames() {
        String string = "";
        for (int i = 0; i < list.length; i++) {
            string += list[i] + ", ";
        }
        System.out.println("Unsafe car -  " + string);
    }

}
