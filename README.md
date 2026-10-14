# GradeWise — Student Grade Management System

## Assignment Topic
**Real-World Applications of Arrays as a Data Structure**

## Project Overview
GradeWise is a console-based student grade management system implemented in **C++ and Java**. It helps teachers manage student names and marks, calculate grades, search for students, remove records, and calculate class statistics.

## Real-World Application
Schools and universities maintain student records containing names, examination marks, and grades. GradeWise demonstrates how arrays can store and process these records efficiently.

## Technologies Used
- C++
- Java
- Arrays
- Functions and methods
- Loops and conditional statements

## Features
- Add student records
- View all student records
- Search for a student
- Remove a student record
- Calculate class average
- Identify the highest mark
- Calculate pass statistics

## Project Structure

```text
array-grade-manager/
├── cpp-version/
│   └── main.cpp
├── java-version/
│   └── Main.java
└── README.md
```

## How Arrays Are Used
Arrays store student records in memory. The program accesses array elements by index, loops through records to display them, searches for matching names, and processes marks to calculate statistics.

## How to Run

### C++
1. Open `cpp-version/main.cpp` in Code::Blocks or another C++ IDE.
2. Build and run the program.

### Java
1. Open `java-version/Main.java` in a Java IDE or terminal.
2. Compile and run the program using a Java Development Kit (JDK).

```bash
javac Main.java
java Main
```

## Comparison of the C++ and Java Implementations

Both implementations solve the same real-world problem: managing student records and calculating academic statistics. However, they use arrays differently.

### C++ Implementation

The C++ version uses an array of structures:

```cpp
struct Student {
    string name;
    double mark;
};

Student students[MAX_STUDENTS];
```

Each array element stores both the student's name and mark in one record.

### Java Implementation

The Java version uses two parallel arrays:

```java
String[] names = new String[MAX_STUDENTS];
double[] marks = new double[MAX_STUDENTS];
```

The student's name and mark are stored at the same index in their respective arrays. For example, `names[0]` and `marks[0]` represent the same student.

### Advantages of Arrays

- Store multiple records under one variable name.
- Access individual records using indexes.
- Process records efficiently using loops.
- Support searching and calculating statistics.

### Limitations of Arrays

- The array capacity is fixed at 100 students.
- Removing records requires shifting subsequent elements.
- Parallel arrays must remain synchronized.
- Searching by name requires checking records one by one.

## Conclusion

GradeWise demonstrates a real-world application of arrays in school administration. By implementing the system in C++ and Java, the project shows how arrays can store, organize, search, and process student records to produce useful academic statistics.
