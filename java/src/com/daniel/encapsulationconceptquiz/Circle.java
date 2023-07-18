package com.daniel.encapsulationconceptquiz;

import java.text.DecimalFormat;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedArea = decimalFormat.format(Math.PI*getRadius()*getRadius());
        System.out.println("Area of the Circle: " + formattedArea + " m2");
    }

    public void calculatePerimeter() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedPerimeter = decimalFormat.format(2*Math.PI*getRadius());
        System.out.println("Perimeter of the Circle: " + formattedPerimeter + " m");
    }




}

