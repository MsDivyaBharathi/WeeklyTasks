package Day6.Q4;
import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    private HashMap<String, Integer> studentGrades;

    // Constructor
    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student added: " + name + " with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println("Grade of " + name + " is: " + studentGrades.get(name));
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();
        Scanner scanner = new Scanner(System.in);

        // Adding some students
        sg.addStudent("Alice", 85);
        sg.addStudent("Bob", 92);
        sg.addStudent("Charlie", 78);

        // Displaying a student's grade
        System.out.print("Enter student name to display grade: ");
        String name = scanner.nextLine();
        sg.displayGrade(name);

        // Removing a student
        System.out.print("Enter student name to remove: ");
        name = scanner.nextLine();
        sg.removeStudent(name);

        // Displaying a student's grade again
        System.out.print("Enter student name to display grade: ");
        name = scanner.nextLine();
        sg.displayGrade(name);

        scanner.close();
    }
}