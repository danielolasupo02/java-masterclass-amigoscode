package com.daniel.abstractconceptquiz;

public class Triangle extends Shape{
    private int base;
    private int height;
    private int sideA,sideB, sideC;

    public Triangle(int base, int height, int sideA, int sideB, int sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        return 0.5*this.base*this.height;
    }

    @Override
    public double calculatePerimeter() {
        return this.sideA+this.sideA+this.sideC;
    }
}
