package com.grade;

public class StudentGrade {

    String name;
    double[] marks;
    double average;
    char grade;

    public StudentGrade(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
        this.average = GradeCalculator.calculateAverage(marks);
        this.grade = GradeCalculator.calculateGrade(this.average);
    }
}

