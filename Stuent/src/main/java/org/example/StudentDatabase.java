package org.example;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class StudentDatabase {
    private Map<String, Student> studentMap;
    private Scanner scanner;

    public StudentDatabase() {
        studentMap = new HashMap<>();
        scanner = new Scanner(System.in);
    }
    //Allows user to add Student details
    public void addStudent() {
        System.out.println("Enter student ID:");
        String id = scanner.nextLine();
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student age:");
        String age = scanner.nextLine();
        System.out.println("Enter student email:");
        String email = scanner.nextLine();
        System.out.println("Enter student course:");
        String course = scanner.nextLine();

        Student student = new Student(id, name, age, email, course);
        studentMap.put(id, student);
        System.out.println("Student added successfully!");
    }
    //Prompts user to search a student by their ID
    public void viewStudent() {
        System.out.println("Enter student ID to view:");
        String id = scanner.nextLine();
        Student student = studentMap.get(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }
    //If data input is wrong user can update student information
    public void updateStudent() {
        System.out.println("Enter student ID to update:");
        String id = scanner.nextLine();
        Student student = studentMap.get(id);
        if (student != null) {
            System.out.println("Enter new name (leave blank to keep current):");
            String name = scanner.nextLine();
            if (!name.isBlank()) {
                student.setName(name);
            }

            System.out.println("Enter new email (leave blank to keep current):");
            String email = scanner.nextLine();
            if (!email.isBlank()) {
                student.setEmail(email);
            }

            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
    //Protal menu is displayed as the following:
    public void run() {
        while (true) {
            System.out.println("Student Portal Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    viewStudent();
                    break;
                case "3":
                    updateStudent();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}

