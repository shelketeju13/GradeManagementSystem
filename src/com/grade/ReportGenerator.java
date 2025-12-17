package com.grade;

public class ReportGenerator {

    public static void generateReport(StudentGrade[] students, int count) {

        double[] subjectTotal = new double[5];
        int a=0,b=0,c=0,d=0,f=0;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 5; j++) {
                subjectTotal[j] += students[i].marks[j];
            }

            switch (students[i].grade) {
                case 'A': a++; break;
                case 'B': b++; break;
                case 'C': c++; break;
                case 'D': d++; break;
                case 'F': f++; break;
            }
        }

        // Sort for top performers
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (students[j].average > students[i].average) {
                    StudentGrade temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("\n=== PERFORMANCE REPORT ===");
        System.out.println("Total Students: " + count);

        System.out.println("\n📊 SUBJECT AVERAGES:");
        System.out.printf("• Mathematics: %.2f%n", subjectTotal[0] / count);
        System.out.printf("• Science: %.2f%n", subjectTotal[1] / count);
        System.out.printf("• English: %.2f%n", subjectTotal[2] / count);
        System.out.printf("• History: %.2f%n", subjectTotal[3] / count);
        System.out.printf("• Computer: %.2f%n", subjectTotal[4] / count);

        System.out.println("\n🏆 TOP PERFORMERS:");
        
        // Sort students by average (descending)
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (students[j].average > students[i].average) {
                    StudentGrade temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }


        System.out.println("\n📈 GRADE DISTRIBUTION:");
        System.out.println("• A Grade: " + a + " students");
        System.out.println("• B Grade: " + b + " students");
        System.out.println("• C Grade: " + c + " students");
        System.out.println("• D Grade: " + d + " students");
        System.out.println("• F Grade: " + f + " students");
    }
}

