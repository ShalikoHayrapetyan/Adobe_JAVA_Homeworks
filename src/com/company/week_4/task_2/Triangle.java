package com.company.week_4.task_2;

import java.util.Objects;

public class Triangle {
    private final Point p1;
    private final Point p2;
    private final Point p3;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public Triangle(Point p1, Point p2, Point p3) {
        AssertionUtils.assertNotNull(p1);
        AssertionUtils.assertNotNull(p2);
        AssertionUtils.assertNotNull(p3);

        this.p1 = new ImmutablePoint(p1);
        this.p2 = new ImmutablePoint(p2);
        this.p3 = new ImmutablePoint(p3);
    }

    public Triangle(Triangle triangle) {
        AssertionUtils.assertNotNull(triangle);

        this.p1 = new ImmutablePoint(triangle.getP1());
        this.p2 = new ImmutablePoint(triangle.getP2());
        this.p3 = new ImmutablePoint(triangle.getP3());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(p1, triangle.p1) && Objects.equals(p2, triangle.p2) && Objects.equals(p3, triangle.p3);
    }

}
