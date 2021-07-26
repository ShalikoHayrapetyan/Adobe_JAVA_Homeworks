package com.company.week_3.Polymorphism.task_2;

public class Square implements Shape{

    private final double side;

    public Square(double side) {
        this.side=side;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
