package com.company.week_10.Numbers_generator_and_printer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SequentialNumbers integerNumbers = new SequentialNumbers(8, "integer");
        SequentialNumbers   doubleNumbers = new SequentialNumbers(5, "double");
        ArrayList result = integerNumbers.getRandomNumbers();
        System.out.println("////////////////////////");
        ArrayList result1 = integerNumbers.getListValues();
        System.out.println("////////////////////////");
        ArrayList result2 = doubleNumbers.getListValues();

    }
}
