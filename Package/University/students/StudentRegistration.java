package University.students;

import java.util.ArrayList;

public class StudentRegistration {
    private ArrayList<Student> students = new ArrayList<>();

    public void registerStudent(int id, String name, String course) {
        Student student = new Student(id, name, course);
        students.add(student);
        System.out.println("Student registered successfully: " + student);
    }

    public void showAllStudents() {
    	if(students.size()>0) {
	        System.out.println("=== All Registered Students ===");
	        for (Student student : students) {
	            System.out.println(student);
	        }
    	}
    	else {
    		System.out.println("=== No Registered Students ===");
    	}
    }
}
