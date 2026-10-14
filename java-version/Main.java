import java.util.Scanner;

public class Main {
    private static final int MAX_STUDENTS = 100;
    private static final String[] names = new String[MAX_STUDENTS];
    private static final double[] marks = new double[MAX_STUDENTS];
    private static int count = 0;
    private static final Scanner input = new Scanner(System.in);

    private static char grade(double mark) {
        if (mark >= 80) return 'A';
        if (mark >= 70) return 'B';
        if (mark >= 60) return 'C';
        if (mark >= 50) return 'D';
        return 'F';
    }

    private static void addStudent() {
        if (count == MAX_STUDENTS) {
            System.out.println("Student list is full.");
            return;
        }
        System.out.print("Enter student name: ");
        String name = input.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }
        System.out.print("Enter mark (0-100): ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid mark.");
            input.nextLine();
            return;
        }
        double mark = input.nextDouble();
        input.nextLine();
        if (mark < 0 || mark > 100) {
            System.out.println("Mark must be from 0 to 100.");
            return;
        }
        names[count] = name;
        marks[count] = mark;
        count++;
        System.out.println("Student added.");
    }

    private static void viewStudents() {
        if (count == 0) {
            System.out.println("No records yet.");
            return;
        }
        System.out.printf("%-5s %-25s %-10s %s%n", "No.", "Name", "Mark", "Grade");
        for (int i = 0; i < count; i++)
            System.out.printf("%-5d %-25s %-10.1f %c%n",
                    i + 1, names[i], marks[i], grade(marks[i]));
    }

    private static void searchStudent() {
        System.out.print("Enter full name: ");
        String target = input.nextLine().trim();
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.printf("%s | Mark: %.1f | Grade: %c%n",
                        names[i], marks[i], grade(marks[i]));
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void removeStudent() {
        System.out.print("Enter full name to remove: ");
        String target = input.nextLine().trim();
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                for (int j = i; j < count - 1; j++) {
                    names[j] = names[j + 1];
                    marks[j] = marks[j + 1];
                }
                count--;
                names[count] = null;
                marks[count] = 0;
                System.out.println("Student removed.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void statistics() {
        if (count == 0) {
            System.out.println("Add students first.");
            return;
        }
        double total = 0, highest = marks[0];
        int passed = 0;
        for (int i = 0; i < count; i++) {
            total += marks[i];
            if (marks[i] > highest) highest = marks[i];
            if (marks[i] >= 50) passed++;
        }
        System.out.printf("Students: %d%nAverage: %.2f%nHighest mark: %.1f%nPassed: %d%nPass rate: %.2f%%%n",
                count, total / count, highest, passed, 100.0 * passed / count);
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== GRADEWISE: JAVA ===");
            System.out.println("1. Add student\n2. View students\n3. Search student");
            System.out.println("4. Remove student\n5. Class statistics\n0. Exit");
            System.out.print("Choose: ");
            if (!input.hasNextInt()) {
                System.out.println("Enter a number.");
                input.nextLine();
                choice = -1;
                continue;
            }
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: removeStudent(); break;
                case 5: statistics(); break;
                case 0: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid option.");
            }
        } while (choice != 0);
        input.close();
    }
}
