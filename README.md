# GradeWise — Student Grade Management System

## Assignment Topic
**Real-World Applications of Arrays as a Data Structure**

## Project Overview
GradeWise is a console-based student grade management system developed in **C++**. It demonstrates how arrays can be used to store and manage student records, calculate grades, search for students, remove records, and generate class statistics.

## Real-World Application
Schools and universities maintain student records containing names, examination marks, and grades. GradeWise demonstrates how arrays can be used to store and process these records in a simple and organized way.

## Technologies Used
- C++
- Arrays
- Structures (`struct`)
- Functions
- Loops and conditional statements

## Features
- Add student records
- View all student records
- Search for a student by name
- Remove a student record
- Calculate the class average
- Identify the highest mark
- Calculate the number of students who passed
- Calculate the class pass rate
- Assign grades based on examination marks

## Project Structure

```text
array-grade-manager/
├── cpp-version/
│   └── main.cpp
└── README.md
```

## How Arrays Are Used

GradeWise uses an array of structures to store student information. Each element contains a student's name and examination mark.

```cpp
struct Student {
    string name;
    double mark;
};

Student students[MAX_STUDENTS];
```

The array allows the program to store multiple student records under one variable name. Each record can be accessed using an index.

The program uses loops to display and process records, searches through the array to find students, shifts elements when removing a record, and processes marks to calculate grades and class statistics.

## How to Run the Program

1. Open `cpp-version/main.cpp` in Code::Blocks or another C++ IDE.
2. Build or compile the program.
3. Run the executable.
4. Follow the on-screen menu to manage student records.

Alternatively, if a C++ compiler such as `g++` is installed, open a terminal in the project directory and run:

```bash
g++ cpp-version/main.cpp -o GradeWise
```

On Windows, run the compiled program using:

```bash
GradeWise.exe
```

## Advantages of Arrays
- Store multiple student records under one variable name.
- Allow direct access to records using indexes.
- Make it easy to process records using loops.
- Support searching, record management, and statistical calculations.

## Limitations of Arrays
- The array has a fixed capacity of 100 students.
- Removing a record requires shifting subsequent elements.
- Searching by name requires checking records one by one.
- The program's records are stored in memory and are not automatically saved permanently after the program closes.

## Conclusion
GradeWise demonstrates a real-world application of arrays in school administration. Using C++, the system stores, organizes, searches, and processes student records to calculate grades and useful academic statistics. The project illustrates how arrays can solve practical problems while also highlighting their limitations, including fixed capacity and the need to shift elements when removing records.
