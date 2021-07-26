package com.company.week_3.Polymorphism.task_2;

public class RightTriangle implements Shape{

    private final double side1;
    private final double side2;

    public RightTriangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String getName() {
        return "RightTriangle";
    }

    @Override
    public double calculateArea() {
        return side1*side2/2;
    }
}
