package com.daniel;

import java.util.ArrayList;

public class Student {
    private String name;
    private int grade;
    private ArrayList<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public void regDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Grade: " + getGrade());
        System.out.println("Courses: " + getCourses());
    }
}
