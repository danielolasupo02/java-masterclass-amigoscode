package com.daniel;

import java.text.DecimalFormat;
import java.util.Objects;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }



    public double circleArea() {
        return Math.PI*(getRadius()*getRadius());
    }

    public double circlePerimeter() {
        return 2*Math.PI*(getRadius());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
