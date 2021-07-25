package com.company.week_3.Static_Fields;

public class Main {

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l11= new Laptop();
        Laptop l12 = new Laptop();
        Laptop l13 = new Laptop();
        Laptop l14 = new Laptop();
        Laptop l15 = new Laptop();

        setVal(l1, 8);
        System.out.println(l1.value);

    }

    public static void setVal(Laptop l, int value) {
        l.value = value;
    }


}
