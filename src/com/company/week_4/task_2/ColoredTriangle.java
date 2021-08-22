package com.company.week_4.task_2;

import java.util.Objects;

public class ColoredTriangle extends  Triangle{

    private final Color color;

    public ColoredTriangle(Point p1, Point p2, Point p3, Color color) {
        super(p1, p2, p3);
        this.color = color;
    }

    public ColoredTriangle(Triangle triangle, Color color) {
        super(triangle);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ColoredTriangle that = (ColoredTriangle) o;
        return color == that.color;
    }


    @Override
    public String toString() {
        return "ColoredTriangle{" +
                "color=" + color +
                '}';
    }
}
