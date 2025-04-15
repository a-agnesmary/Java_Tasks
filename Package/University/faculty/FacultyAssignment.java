package University.faculty;

import University.courses.Course;
import java.util.*;

public class FacultyAssignment {
    private Map<Faculty, List<Course>> facultyCourseMap = new HashMap<>();

    public void assignFacultyToCourse(Faculty faculty, Course course) 
    {
        facultyCourseMap.computeIfAbsent(faculty, k -> new ArrayList<>()).add(course);
        System.out.println("Faculty " + faculty.getName() + " assigned to course: " + course.getCourseName());
    }

    public void showAssignedFaculty() 
    {
    	if(facultyCourseMap.size()>0) {
    		System.out.println("=== Assigned Faculty and Their Courses ===");
            for (Map.Entry<Faculty, List<Course>> entry : facultyCourseMap.entrySet()) {
                System.out.println("Faculty: " + entry.getKey().getName());
                for (Course c : entry.getValue()) {
                    System.out.println("  - " + c.getCourseCode() + " | " + c.getCourseName());
                }
            }
    	}
    	else {
    		System.out.println("=== No Assigned Faculty ===");
    	}
        
    }
}
