## Overview
This project is a menu-driven Java application that manages student records using an ArrayList. It demonstrates key Java concepts including classes, arrays of objects, instance members, and constructors. Users can perform various operations such as adding, displaying, searching (by PRN, name, or position), updating, and deleting student records.

## Table of Contents
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [Methods](#methods)
- [Contributing](#contributing)
- [License](#license)

## Features
- **Student Management:** Add, display, search, update, and delete student records.
- **Search Operations:** Find students by PRN, name, or array position.
- **Modular Code:** Each operation is implemented as a separate function in its own Java file.
- **Coding Best Practices:** The code includes proper comments, follows naming conventions, and adheres to standard coding guidelines.

## Getting Started
To get started with this project, follow these steps:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/YourUsername/Student_Management_System.git
   cd Student_Management_System
   ```

2. **Compile the Java Files:**
   ```bash
   javac *.java
   ```

3. **Run the Application:**
   ```bash
   java Main
   ```

## Usage
1. Upon running the program, a menu will be displayed.
2. Select an option to add a student, display all students, search by PRN, name, or position, update, or delete a student.
3. Follow the prompts to perform the desired operation.
4. The program will continue to display the menu until you choose to exit.

## Code Structure
The project consists of the following files:

```
Student-Java-Lab/
├── Student.java             # Contains the Student class with attributes (PRN, name, DoB, marks)
├── StudentOperations.java   # Implements operations on an ArrayList of Student objects
└── Main.java                # The main driver file with the menu-driven interface
```

## Methods

### Student.java
- **Constructor:** Initializes a student with PRN, name, DoB, and marks.
- **Getter and Setter Methods:** Retrieve and update student attributes.
- **toString():** Returns a string representation of the student object.

### StudentOperations.java
- `addStudent(Student student)`: Adds a student to the ArrayList.
- `displayStudents()`: Displays details of all students.
- `searchByPrn(String prn)`: Searches for a student by their PRN.
- `searchByName(String name)`: Searches for a student by their name.
- `searchByPosition(int position)`: Retrieves a student by their array position.
- `updateStudent(String prn, Student updatedStudent)`: Updates details of an existing student.
- `deleteStudent(String prn)`: Deletes a student using their PRN.

### Main.java
- `main(String[] args)`: Provides a menu-driven interface to interact with the student records and orchestrates calls to the methods in StudentOperations.java.

## Contributing
Contributions are welcome! Please fork this repository and submit a pull request with your improvements or new features. Ensure you commit each file and function separately for clear version tracking.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
