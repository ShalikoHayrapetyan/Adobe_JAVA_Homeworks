package com.company.week_10.Safe_cartesian_system;

public class Main {
    public static void main(String[] args) {
        CartesianSystem cartesianSystem = new CartesianSystem();

        cartesianSystem.setXY(1, 1);


        new Thread(new Runnable() {
            @Override
            public void run() {
                cartesianSystem.setXY(-1, -1);
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                cartesianSystem.setXY(-2, -2);
            }
        }).start();

        System.out.println(cartesianSystem.fetch()[0] + " : " + cartesianSystem.fetch()[1]);

    }
}

