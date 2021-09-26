package com.company.week_10.Numbers_generator_and_printer;

import java.util.ArrayList;
import java.util.Random;

public class SequentialNumbers extends Number {

    private Integer number = 0;
    public Integer count = 2;
    private final String type;
    private ArrayList result = new ArrayList(number);

    public SequentialNumbers(Integer number, String type) {
        this.number = number;
        this.type = type;

    }

    public ArrayList getListValues() {
        if (result.size() > 0) result.clear();
        switch (type) {
            case "integer":
                for (int i = 1; i <= number; i++) {
                    if (count == null) count = new Random().nextInt();
                    result.add(count * intValue() * i);
                }
                break;
            case "double":
                for (int i = 1; i <= number; i++) {
                    if (count == null) count = new Random().nextInt();
                    result.add(count * doubleValue() * i);
                }
                break;
            case "float":
                for (int i = 1; i <= number; i++) {
                    if (count == null) count = new Random().nextInt();
                    result.add(count * floatValue() * i);
                }
                break;
            default:
                // code block
        }
        for (int i = 0; i < number; i++) {
            System.out.println(result.get(i));
        }
        count = 2;
        return result;
    }

    public ArrayList getRandomNumbers() {
        count = null;
        return getListValues();

    }

    @Override
    public int intValue() {

        return 1;
    }

    @Override
    public long longValue() {
        return 1;
    }

    @Override
    public float floatValue() {
        return 1;
    }

    @Override
    public double doubleValue() {
        return 1;
    }

}
