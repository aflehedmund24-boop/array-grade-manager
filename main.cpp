#include <iostream>
#include <string>
#include <iomanip>
#include <limits>
using namespace std;

const int MAX_STUDENTS = 100;

struct Student {
    string name;
    double mark;
};

char grade(double mark) {
    if (mark >= 80) return 'A';
    if (mark >= 70) return 'B';
    if (mark >= 60) return 'C';
    if (mark >= 50) return 'D';
    return 'F';
}

void addStudent(Student students[], int &count) {
    if (count == MAX_STUDENTS) {
        cout << "Student list is full.\n";
        return;
    }
    Student s;
    cout << "Enter student name: ";
    getline(cin >> ws, s.name);
    cout << "Enter mark (0-100): ";
    if (!(cin >> s.mark) || s.mark < 0 || s.mark > 100) {
        cout << "Invalid mark.\n";
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        return;
    }
    students[count++] = s;
    cout << "Student added.\n";
}

void viewStudents(const Student students[], int count) {
    if (!count) { cout << "No records yet.\n"; return; }
    cout << left << setw(5) << "No." << setw(25) << "Name"
         << setw(10) << "Mark" << "Grade\n";
    for (int i = 0; i < count; ++i)
        cout << left << setw(5) << i + 1 << setw(25) << students[i].name
             << setw(10) << fixed << setprecision(1) << students[i].mark
             << grade(students[i].mark) << '\n';
}

void searchStudent(const Student students[], int count) {
    string target;
    cout << "Enter full name: ";
    getline(cin >> ws, target);
    for (int i = 0; i < count; ++i) {
        if (students[i].name == target) {
            cout << students[i].name << " | Mark: " << students[i].mark
                 << " | Grade: " << grade(students[i].mark) << '\n';
            return;
        }
    }
    cout << "Student not found.\n";
}

void removeStudent(Student students[], int &count) {
    string target;
    cout << "Enter full name to remove: ";
    getline(cin >> ws, target);
    for (int i = 0; i < count; ++i) {
        if (students[i].name == target) {
            for (int j = i; j < count - 1; ++j) students[j] = students[j + 1];
            --count;
            cout << "Student removed.\n";
            return;
        }
    }
    cout << "Student not found.\n";
}

void statistics(const Student students[], int count) {
    if (!count) { cout << "Add students first.\n"; return; }
    double total = 0, highest = students[0].mark;
    int passed = 0;
    for (int i = 0; i < count; ++i) {
        total += students[i].mark;
        if (students[i].mark > highest) highest = students[i].mark;
        if (students[i].mark >= 50) ++passed;
    }
    cout << fixed << setprecision(2)
         << "Students: " << count << "\nAverage: " << total / count
         << "\nHighest mark: " << highest << "\nPassed: " << passed
         << "\nPass rate: " << (100.0 * passed / count) << "%\n";
}

int main() {
    Student students[MAX_STUDENTS];
    int count = 0, choice;
    do {
        cout << "\n=== GRADEWISE: C++ ===\n"
             << "1. Add student\n2. View students\n3. Search student\n"
             << "4. Remove student\n5. Class statistics\n0. Exit\nChoose: ";
        if (!(cin >> choice)) {
            cout << "Enter a number.\n";
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
            choice = -1;
            continue;
        }
        switch (choice) {
            case 1: addStudent(students, count); break;
            case 2: viewStudents(students, count); break;
            case 3: searchStudent(students, count); break;
            case 4: removeStudent(students, count); break;
            case 5: statistics(students, count); break;
            case 0: cout << "Goodbye!\n"; break;
            default: cout << "Invalid option.\n";
        }
    } while (choice != 0);
    return 0;
}
