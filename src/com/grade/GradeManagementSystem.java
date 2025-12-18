package com.grade;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class GradeManagementSystem {

    private static final int MAX = 100;
    private static final int SUBJECTS = 5;

    private static StudentGrade[] students = new StudentGrade[MAX];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loadFromFile();
        int choice;

        do {
            System.out.println("\n=== GRADE MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Student Marks");
            System.out.println("2. View All Students");
            System.out.println("3. Calculate Averages");
            System.out.println("4. Find Top Performers");
            System.out.println("5. Generate Report");
            System.out.println("6. Save & Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: 
                	addStudent(sc); 
                	break;
                case 2: 
                	viewStudents();
                    break;
                case 3: 
                	showAverages();
                    break;
                case 4: 
                	showTopPerformers(); 
                	break;
                case 5: 
                	ReportGenerator.generateReport(students, count); 
                	break;
                case 6:
                    saveToFile();    //SAVE before exit
                    System.out.println("Data saved. Exiting...");
                    break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }

    // Add Student
    static void addStudent(Scanner sc) {
        System.out.println("\n=== ADD STUDENT MARKS ===");
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        double[] marks = new double[SUBJECTS];
        String[] sub = {"Mathematics", "Science", "English", "History", "Computer"};

        System.out.println("\nEnter marks for 5 subjects (out of 100):");

        for (int i = 0; i < SUBJECTS; i++) {
            while (true) {
                System.out.print(sub[i] + ": ");
                double mark = sc.nextDouble();

                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    break;
                } else {
                    System.out.println("❌ Invalid marks! Please enter between 0 and 100.");
                }
            }
        }

        students[count++] = new StudentGrade(name, marks);
        System.out.println("✅ Student marks added successfully!");
    }


    // View Students
    static void viewStudents() {
        System.out.println("\n=== ALL STUDENTS ===");
        System.out.printf("%-20s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                "Student Name","Math","Science","English","History","Computer","Average");
        System.out.println("----------------------------------------------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            double[] m = students[i].marks;
            System.out.printf("%-20s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f%n",
                    students[i].name, m[0], m[1], m[2], m[3], m[4], students[i].average);
        }
    }

    // Averages
    static void showAverages() {
        System.out.println("\n=== STUDENT AVERAGES ===");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].name +
                    "    : Average = " +
                    String.format("%.2f", students[i].average) +
                    ", Grade = " + students[i].grade);
        }
    }

    // Top Performers
    static void showTopPerformers() {

        // Bubble sort by average (descending)
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (students[j].average > students[i].average) {
                    StudentGrade temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("\n=== TOP PERFORMERS ===");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " +
                    students[i].name +
                    " - Average: " +
                    String.format("%.2f", students[i].average));
        }
    }
    
    static void loadFromFile() {
        File dataFile = new File("examples/student_data.txt");
        File sampleFile = new File("examples/sample_grade.txt");

        try {
            Scanner fs;

            if (dataFile.exists()) {
                fs = new Scanner(dataFile);
            } else if (sampleFile.exists()) {
                fs = new Scanner(sampleFile);
            } else {
                return;
            }

            while (fs.hasNextLine() && count < MAX) {
                String line = fs.nextLine();
                String[] data = line.split(",");

                String name = data[0];
                double[] marks = new double[SUBJECTS];

                for (int i = 0; i < SUBJECTS; i++) {
                    marks[i] = Double.parseDouble(data[i + 1]);
                }

                students[count++] = new StudentGrade(name, marks);
            }

            fs.close();

        } catch (Exception e) {
            System.out.println("Error loading data from file.");
        }
    }

    
    static void saveToFile() {
        try {
            PrintWriter pw = new PrintWriter("examples/student_data.txt");

            for (int i = 0; i < count; i++) {
                pw.print(students[i].name);
                for (double m : students[i].marks) {
                    pw.print("," + m);
                }
                pw.println();
            }
            pw.close();

        } catch (Exception e) {
            System.out.println("Error saving data.");
        }
    }



}
