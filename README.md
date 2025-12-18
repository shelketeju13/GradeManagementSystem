# GradeManagementSystem


## Project Overview

The **Grade Management System** is a console-based Java application developed as part of an internship task.
The system allows users to manage student marks, calculate averages, determine grades, identify top performers, and generate detailed performance reports.

The project demonstrates Java fundamentals, arrays, object-oriented programming, file handling, and menu-driven application design.

---

## Objectives

* Implement Java programming fundamentals
* Apply object-oriented concepts (classes and methods)
* Store student marks using arrays
* Calculate averages and grade categories
* Build a menu-driven console application
* Implement file persistence for student data

---

## Features

* Add student marks for multiple subjects
* View all student records in tabular format
* Calculate student averages and grades
* Identify top-performing students
* Generate performance reports:

  * Subject-wise averages
  * Grade distribution
  * Top performers list
* Input validation for marks (0–100 range)
* File persistence using text files

---

## Technologies Used

* Java
* Scanner class for user input
* Arrays for data storage
* File handling (`File`, `Scanner`, `PrintWriter`)
* Spring Tool Suite (STS)
* GitHub for version control

---

## Project Structure

```text
GradeManagementSystem/
├── README.md
├── src/
│   └── com/grade/
│       ├── GradeManagementSystem.java
│       ├── StudentGrade.java
│       ├── GradeCalculator.java
│       └── ReportGenerator.java
├── docs/
│   └── Project_Documentation.md
├── examples/
    └── sample_grade.txt
    └── student_data.txt


```

---

## File Description

* **sample_grade.txt**
  Contains sample student data loaded when the application runs for the first time.

* **student_data.txt**
  Stores student data permanently after saving.
  This file is automatically created or updated when the program exits.

---

## Setup & Execution

1. Install **JDK 8**
2. Open **Spring Tool Suite (STS)**
3. Import the project as a **Java Project**
4. Ensure text files are placed correctly
5. Run `GradeManagementSystem.java`
6. Use the menu to interact with the system

---

## Menu Options

1. Add Student Marks
2. View All Students
3. Calculate Averages
4. Find Top Performers
5. Generate Performance Report
6. Save & Exit

---

## Testing

The application has been tested for:

* Valid and invalid marks input
* Grade calculation accuracy
* File loading and saving
* Menu navigation and error handling

Sample data is provided in the `examples` folder.

---

## Conclusion

This project fulfills the internship requirements by implementing a complete **Grade Management System** using Java.
It demonstrates proper use of arrays, file handling, object-oriented design, and console-based user interaction.

---

## Author

**Tejaswini Shelke**
