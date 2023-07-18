package com.daniel.encapsulationconceptquiz;

public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private int mileage;

    public Car(String company_name, String model_name, int year, int mileage) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage;
    }

    public void printCarDetails() {
        System.out.println("Brand Name: " + getCompany_name());
        System.out.println("Model Name: " + getModel_name());
        System.out.println("Year Est. : " + getYear());
        System.out.println("Mileage : " + getMileage());
        System.out.println("===================================");
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMileage() {
        return mileage + " km per year";
    }




}
