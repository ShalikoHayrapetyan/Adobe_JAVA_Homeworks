package com.company.week_4.task_3;

public class SlowClock {
    private int speedInMillis = 2000;
    private int second = 0;

    public void start() {
        System.out.println(second);
        long statTime = System.currentTimeMillis();
        while (true) {
            if (System.currentTimeMillis() - statTime >= speedInMillis) {
                System.out.println(++second);
                statTime = System.currentTimeMillis();
            }
        }
    }
}
