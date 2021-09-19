package com.company.week_10.Safe_and_Unsafe_Car;

public class Main {
    public static void main(String[] args) {
        UnsafeCar unsafeCar = new UnsafeCar();

        new Thread(new Runnable() {
            @Override
            public void run() {
                unsafeCar.add("People1");
                unsafeCar.add("People2");
                unsafeCar.add("People3");
                unsafeCar.add("People4");
                unsafeCar.add("People5");
                unsafeCar.add("People6");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                unsafeCar.printPassangerNames();

            }
        }).start();

        SafeCar safeCar = new SafeCar();

        new Thread(new Runnable() {
            @Override
            public void run() {
                safeCar.add("People1");
                safeCar.add("People2");
                safeCar.add("People3");
                safeCar.add("People4");
                safeCar.add("People5");
                safeCar.add("People6");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                safeCar.printPassangerNames();

            }
        }).start();

    }
}
