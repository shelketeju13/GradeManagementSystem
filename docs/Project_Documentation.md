# Grade Management System

---

## 1. Project Overview

The **Grade Management System** is a console-based Java application developed as part of an internship task.
The main goal of this project is to manage student marks efficiently, calculate averages, assign grades, identify top performers, and generate performance reports.

The system uses arrays and object-oriented programming concepts and supports file persistence to store student data permanently.

---

## 2. Project Objectives

* Store student marks for multiple subjects
* Calculate average, highest, and lowest marks
* Assign grade categories (A, B, C, D, F)
* Provide a menu-driven user interface
* Generate performance and summary reports
* Validate user input (marks between 0–100)
* Implement file persistence for saving and loading data

---

## 3. Technologies Used

- **Programming Language:** Java  
- **Development Environment:** Spring Tool Suite (STS)  
- **Java Version:** JDK 8  
- **Input Handling:** Scanner class  
- **Data Storage:**  
  - Arrays for in-memory data handling  
  - Text files (`.txt`) for file persistence  
- **File Handling:** File, Scanner, PrintWriter  
- **Version Control:** Git & GitHub  
- **Operating System Support:** Windows  

---

## 4. System Requirements

- Operating System: Windows 11
- Java Development Kit (JDK): Version 8  
- IDE: Spring Tool Suite (STS) 
- Git: For version control and GitHub submission  

---

## 5. Setup and Installation Instructions

### Prerequisites

* JDK 8 
* Spring Tool Suite (STS) 

### Steps

1. Open **Spring Tool Suite**
2. Import the project as a **Java Project**
3. Ensure all `.java` files are inside the `src` folder
4. Place `sample_grade.txt` inside the `examples` folder
5. Navigate to `GradeManagementSystem.java`
6. Right-click and select **Run As->Java Application**

---

## 6. Project Structure

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
│   └── sample_grade.txt
│   └── student_data.txt
```
---

## 7. Code Structure Explanation

### GradeManagementSystem.java

* Main class of the application
* Displays menu and handles user input
* Calls other classes for calculations and reporting
* Handles file loading and saving

### StudentGrade.java

* Data class to store:

  * Student name
  * Marks array
  * Average marks
  * Grade
* No getters/setters used (direct access as per requirement)

### GradeCalculator.java

* Contains utility methods:

  * `calculateAverage()`
  * `calculateGrade()`

### ReportGenerator.java

* Generates:

  * Subject-wise averages
  * Grade distribution
  * Sorted top performers list

---

## 8. User Manual

### Menu Options

```
1. Add Student Marks
2. View All Students
3. Calculate Averages
4. Find Top Performers
5. Generate Report
6. Save & Exit
```

### How to Use

* Select menu options by entering the corresponding number
* Enter student marks between **0 and 100**
* Use option **6** to save data permanently before exiting

---

## 9. Grading System Explanation

| Average Marks | Grade |
| ------------- | ----- |
| 80 – 100      | A     |
| 70 – 79       | B     |
| 60 – 69       | C     |
| 50 – 59       | D     |
| Below 50      | F     |

Grades are calculated automatically based on the average marks.

---

## 10. File Persistence

* **sample_grade.txt**
  Used to load initial sample data when no saved data exists.

* **student_data.txt**
  Stores student data permanently after selecting **Save & Exit**.

This ensures data is not lost between program executions.

---

## 11. Technical Details

- The application follows a **modular object-oriented design** with separate classes for logic, data, and reporting.
- **Arrays** are used to store student records and subject marks as required.
- Student averages are calculated by summing marks and dividing by the number of subjects.
- Grades (A–F) are assigned based on average marks.
- **Bubble sort** is used to identify top performers by sorting averages in descending order.
- **Text file persistence** is implemented using `sample_grade.txt` and `student_data.txt`.
- Input validation ensures marks are entered between **0 and 100**.
- A **menu-driven console interface** controls application flow using loops and switch-case.


## 12. Technical Requirements Fulfilled

| Requirement                 | Status        |
| --------------------------- | ------------- |
| Arrays for student data     | ✔ Implemented |
| Average & grade calculation | ✔ Implemented |
| Menu-driven system          | ✔ Implemented |
| Search & top performers     | ✔ Implemented |
| Input validation            | ✔ Implemented |
| Performance reports         | ✔ Implemented |
| File persistence            | ✔ Implemented |

---

## 13. Testing Evidence

### Sample Test Cases

| Test Case     | Input         | Expected Output |
| ------------- | ------------- | --------------- |
| Valid Marks   | 85            | Accepted        |
| Invalid Marks | 120           | Error message   |
| Add Student   | Valid details | Student added   |
| File Save     | Exit option   | Data saved      |

---

## 14. Conclusion

The Grade Management System successfully meets all internship requirements.
It demonstrates strong understanding of Java fundamentals, arrays, file handling, and console-based application design.

---

## 15. Author

**Tejaswini Shelke**
