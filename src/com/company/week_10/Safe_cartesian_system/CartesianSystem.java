package com.company.week_10.Safe_cartesian_system;

public class CartesianSystem {
    private Integer x;
    private Integer y;


    public synchronized void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public synchronized int[] fetch() {
        return new int[]{this.x, this.y};
    }

}
