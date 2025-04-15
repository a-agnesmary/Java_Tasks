package University.courses;

import java.util.ArrayList;

public class CourseRegistration {
    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(String courseCode, String courseName, int credits) {
        Course course = new Course(courseCode, courseName, credits);
        courses.add(course);
        System.out.println("Course added successfully: " + course);
    }

    public void showAllCourses() {
        if(courses.size()>0) {
        	System.out.println("=== All Available Courses ===");
            for (Course course : courses) {
                System.out.println(course);
            }
        }
        else {
        	System.out.println("=== No Available Courses ===");
        }
    }
}
