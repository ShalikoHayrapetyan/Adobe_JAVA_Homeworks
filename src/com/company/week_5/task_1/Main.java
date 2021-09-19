package com.company.week_5.task_1;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> array1 = new CustomArrayList<>();
        array1.addToBeginning(5);
        array1.addToBeginning(6);
        array1.addToBeginning(7);
        array1.addToBeginning(8);
        array1.addToBeginning(9);
        array1.addToBeginning(6);
        array1.addToEnd(655);
        array1.addByIndex(1111, 2);
        System.out.println(array1);
        array1.deleteByIndex(2);
        System.out.println(array1);

        array1.deleteElement(7);

        System.out.println(array1);
        array1.bubbleSort();
        System.out.println(array1);

    }
}
