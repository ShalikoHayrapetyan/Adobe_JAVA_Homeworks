package com.company.week_3.Polymorphism.task_2;

public class Circle implements Shape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}
