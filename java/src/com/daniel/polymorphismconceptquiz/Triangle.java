package com.daniel.polymorphismconceptquiz;

public class Triangle extends Shape {
    private double s, sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.s = (sideA+sideB+sideC)/2;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculateArea() {
        return Math.sqrt(this.s*(this.s-this.sideA)*(this.s-this.sideB)*(this.s-this.sideC));
    }
}
