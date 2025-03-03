//Main.java
/*

 * Name: Neil Cardoz
 * PRN: 23070126079
 * Batch: 23-27
 *
 */
import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        int choice;

        // Main menu loop
        do {
            // Displaying menu options
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Search Student by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    // Adding a new student
                    System.out.print("Enter PRN: ");
                    String prn = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Date of Birth (DD-MM-YYYY): ");
                    String dob = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    sc.nextLine(); // Consume newline

                    Student newStudent = new Student(prn, name, dob, marks);
                    operations.addStudent(newStudent);
                    break;

                case 2:
                    // Displaying all students
                    operations.displayStudents();
                    break;


            }
}
