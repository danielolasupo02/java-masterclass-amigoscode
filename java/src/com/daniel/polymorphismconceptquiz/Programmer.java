package com.daniel.polymorphismconceptquiz;

public class Programmer extends Employee{
    private double amount;

        public Programmer(double amount) {
        this.amount = amount;
    }

    public double calculateSalary() {
        return this.amount*2.5;
    }
}
