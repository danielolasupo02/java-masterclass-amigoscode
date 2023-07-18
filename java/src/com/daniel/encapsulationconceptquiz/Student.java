package com.daniel.encapsulationconceptquiz;

import java.util.ArrayList;

public class Student {
//    variables student_id, student_name, and grades
    private String student_id;
    private String student_name;
    private ArrayList<String> grades;

    public Student(String student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<String>();
    }

    public void printStudentResult() {
        System.out.println("========================================");
        System.out.println("Matric Number: " + getStudent_id());
        System.out.println("Student Name: " + getStudent_name());
        System.out.println("Student Grades: " + getGrades());
        System.out.println("========================================");
    }

    public void addGrade(String grade) throws Exception {
        //Ensures grade is either 'A', 'B' or 'C'
        if(grade.length() == 1 && ((grade == "A") || (grade == "B") || (grade == "C"))) {
            grades.add(grade);
        }
        else {throw new IllegalArgumentException("Invalid Grade");}
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public ArrayList<String> getGrades() {
        return grades;
    }
}
