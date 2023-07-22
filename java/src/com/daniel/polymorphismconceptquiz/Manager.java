package com.daniel.polymorphismconceptquiz;

public class Manager extends Employee{
    private double amount;

    public Manager(double amount) {
        this.amount = amount;
    }

    public double calculateSalary() {
        return this.amount*4;
    }
}
