package com.company.week_10.Shared_list;

import com.company.week_10.Safe_and_Unsafe_Car.SafeCar;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 1; j < 501; j++) {
                        addInList(list, j);
                    }
                }
            }).start();
        }

        Thread.sleep(2000);
        System.out.println(list.size());
    }

    static synchronized void addInList(List list, int num) {
        list.add(num);
    }
}
