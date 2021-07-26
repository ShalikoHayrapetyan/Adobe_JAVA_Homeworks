package com.company.week_3.Polymorphism.task_2;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(2, 4);
        RightTriangle rightTriangle = new RightTriangle(3, 4.5);
        Circle circle = new Circle(3);

        System.out.println(square.getName());
        System.out.println(square.calculateArea());
        System.out.println(rectangle.getName());
        System.out.println(rectangle.calculateArea());
        System.out.println(rightTriangle.getName());
        System.out.println(rightTriangle.calculateArea());
        System.out.println(circle.getName());
        System.out.println(circle.calculateArea());

    }
}
