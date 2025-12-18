package com.grade;

public class GradeCalculator {

	// Calculates average marks of a student
    public static double calculateAverage(double[] marks) {
        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return sum / marks.length;
    }

    // Determines grade based on average marks
    public static char calculateGrade(double avg) {
        if (avg >= 80) return 'A';
        else if (avg >= 70) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 50) return 'D';
        else return 'F';
    }
}


