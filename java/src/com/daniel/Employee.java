package com.daniel;

public class Employee {
    private String name;
    private String jobtitle;
    private int salary;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String jobtitle, int salary) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }

    public int increaseSalary(int amount) {
        salary += amount;
        return salary;
    }

    public int decreaseSalary(int amount) {
        salary -= amount;
        return salary;
    }





}
