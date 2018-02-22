package io.javabrains.springbootstarter.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {

	
	private List<Course> CourseList = new ArrayList<> (Arrays.asList(new Course("spring","Spring Framework","Spring Description"),
			   new Course("c","C Framework","C Description"),
			   new Course("c++","C++ Framework","C++ Description")
				));	
	
	public List<Course> getAllCourses()  {
		return CourseList;
	}
	
	
	
	public Course getCourse(String id)  {
		
		Iterator<Course> it = CourseList.iterator();
		Course Course;
		
		while (it.hasNext())  {
			
			Course = it.next();
			if (Course.getId().equals(id))  {
				return Course;
			}
		}		
		return null;		
	}



	public void addCourse(Course Course) {				
		CourseList.add(Course);
	}



	public void updateCourse(Course Course, String id) {

		for (int i = 0; i<CourseList.size(); i++)  {
			Course t = CourseList.get(i);
			if (t.getId().equals(id)) {
				CourseList.set(i, Course);
			}
					
		}
		
	}



	public void deleteCourse(String id) {
		for (int i = 0; i<CourseList.size(); i++)  {
			Course t = CourseList.get(i);
			if (t.getId().equals(id)) {
				CourseList.remove(i);
			}
					
		}
	}
	
}
