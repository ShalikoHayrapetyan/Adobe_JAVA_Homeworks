package com.company.week_3.Autoboxing_Unboxing;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    Random random = new Random();
    Integer negRandNum = new Integer(random.nextInt(0 + 10000) * (-1));

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.absUnboxVal();

        ArrayList<Double> list = new ArrayList<Double>(5);
        Double PI = Math.PI;
        list.add(PI);
        double lastVal = list.get(0);
        System.out.println("List val = " + lastVal);
    }

    public void absUnboxVal() {
        int unboxVal = Math.abs(this.negRandNum);

        System.out.println(unboxVal);
    }
}
