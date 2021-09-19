package com.company.week_10.Custom_safe_list_implementation;

import java.util.UUID;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        UnsafeSimpleList<Number> numberUnsafeSimpleList = new UnsafeSimpleList<>();
        SafeSimpleList<String> stringSafeSimpleList = new SafeSimpleList<>();

        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        numberUnsafeSimpleList.add(j);
                    }
                }
            }).start();
        }

        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        stringSafeSimpleList.add(UUID.randomUUID().toString());
                    }
                }
            }).start();
        }

        Thread.sleep(4000);
        System.out.println("Safe list size - " + stringSafeSimpleList.getSize());
        System.out.println("Unsafe list size - " + numberUnsafeSimpleList.getSize());

    }
}
