/*
 * StudentOperations.java
 * Description: This file contains methods to perform operations on an ArrayList of Student objects.
 */

import java.util.ArrayList;

public class StudentOperations {
    // ArrayList to store Student objects
    private ArrayList<Student> students;

    // Constructor to initialize the ArrayList
    public StudentOperations() {
        students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }
    // Function to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (int i = 0; i < students.size(); i++) {
                System.out.println("Position " + i + ": " + students.get(i));
            }
        }
    }

    // Function to search for a student by PRN
    public Student searchByPrn(String prn) {
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                return student;
            }
        }
        return null;
    }




}
