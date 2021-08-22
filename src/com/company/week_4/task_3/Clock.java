package com.company.week_4.task_3;


public class Clock {
    private final int number;

    public Clock(int number) {
        this.number = number;
        if (number == 2) {
            new SlowClock().start();
        } else if (number == 1) {
            new FastClock().start();
        } else {
            throw new RuntimeException("Number shuld be 1 or 2");
        }
    }
}
