package com.company.week_4.task_2;

import java.util.Objects;

public class ImmutablePoint implements Point{

    private final double x;
    private final double y;

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public ImmutablePoint(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }
    public Point shiftLeft() {
        return new ImmutablePoint(x - 1, y);
    }

    public Point shiftRight() {
        return new ImmutablePoint(x + 1, y);
    }

    public Point shiftUp() {
        return new ImmutablePoint(x, y +1);
    }

    public Point shiftDown() {
        return new ImmutablePoint(x, y - 1);
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutablePoint that = (ImmutablePoint) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0;
    }


}
