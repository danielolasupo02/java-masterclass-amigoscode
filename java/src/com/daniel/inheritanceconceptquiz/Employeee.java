package com.daniel.inheritanceconceptquiz;

public class Employeee extends Person{
    private String employeeId;

    public Employeee(String firstName, String lastName, String employeeId) {
        super(firstName, lastName);
        this.employeeId = employeeId;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
