package com.daniel;

import java.time.LocalDate;
import java.time.Period;

public class Employeee {
    private String name;
    private int salary;
    private LocalDate hireDate;

    public Employeee(String name, int salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

   public int getServiceYearNo() {
        return Period.between(getHireDate(), LocalDate.now()).getYears();
   }

   public void showServiceDetails() {
       System.out.println("Staff Name: " + getName());
       System.out.println("Staff Salary: " + getSalary());
       System.out.println("Service duration: " + getServiceYearNo() + " years");
       System.out.println("==============================");
   }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
