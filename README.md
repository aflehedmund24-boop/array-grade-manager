# GradeWise — Student Grade Management System

**Assignment topic:** Real-world applications of arrays as a data structure.

GradeWise is a console-based application implemented in both C++ and Java. It helps a teacher keep student names and marks, calculate grades, search and remove records, and calculate class statistics.

## Features
- Add students and marks from 0 to 100
- View student records and grades
- Search for a student by name
- Remove a student
- Calculate class average, highest mark, number passed, and pass rate
- Fixed capacity of 100 students

## Grade scale
- 80–100: A
- 70–79: B
- 60–69: C
- 50–59: D
- 0–49: F

A mark of 50 or higher counts as a pass.

## How arrays are used

### C++
`Student students[MAX_STUDENTS]` is an array of structures. A loop processes the array to display records, search, calculate statistics, and remove a record. When a record is removed, later elements shift one position left.

Run from `cpp-version`:
```bash
g++ main.cpp -o gradewise
./gradewise
```
On Windows, run `gradewise.exe` after compiling.

### Java
`names` is a `String[]` array and `marks` is a `double[]` array. The same index in both arrays represents one student, such as `names[0]` and `marks[0]`. Loops process the arrays for searching, displaying, statistics, and removal.

Run from `java-version`:
```bash
javac Main.java
java Main
```

## Project files
```text
array-grade-manager/
├── cpp-version/
│   └── main.cpp
├── java-version/
│   └── Main.java
└── README.md
```

**Note:** Records are stored in memory only and are lost when the program exits. This project intentionally uses fixed-size arrays to demonstrate the assignment topic.
