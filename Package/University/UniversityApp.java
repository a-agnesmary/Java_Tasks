package University;

import University.students.StudentRegistration;
import University.courses.CourseRegistration;
import University.faculty.FacultyAssignment;

import java.util.Scanner;

public class UniversityApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        StudentRegistration studentRegistration = new StudentRegistration();
        CourseRegistration courseRegistration = new CourseRegistration();
        FacultyAssignment facultyAssignment = new FacultyAssignment();
        
        boolean running = true;
        while (running) {
            System.out.println("\n=== University Management Menu ===");
            System.out.println("1. Register Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Add Course");
            System.out.println("4. Show All Courses");
            System.out.println("5. Show Assigned Faculty");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            
			switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter student name: ");
                    String studentName = sc.nextLine();
                    System.out.print("Enter course name: ");
                    String studentCourse = sc.nextLine();
                    studentRegistration .registerStudent(studentId, studentName, studentCourse);
                    break;

                case 2:
                    studentRegistration.showAllStudents();
                    break;

                case 3:
                    System.out.print("Enter course code: ");
                    String courseCode = sc.nextLine();
                    System.out.print("Enter course name: ");
                    String courseName = sc.nextLine();
                    System.out.print("Enter course credits: ");
                    int credits = sc.nextInt();
                    sc.nextLine();
                    courseRegistration.addCourse(courseCode, courseName, credits);
                    break;

                case 4:
                    courseRegistration.showAllCourses();
                    break;

                case 5:
                    facultyAssignment.showAssignedFaculty();
                    break;

                case 6:
                    System.out.println("Exiting the system.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}

