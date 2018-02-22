package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarter.topic.Topic;

@Service
public class CourseService {

	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId)  {

		List<Course> courseList = new ArrayList<Course> ();
		Iterator<Course> it = courseRepository.findByTopicId(topicId).iterator();

		while (it.hasNext())  {
			courseList.add(it.next());
		}
		
		return courseList;
		
	}
	
	
	
	public Course getCourse(String id)  {
		return courseRepository.findOne(id);	
	}

	public void addCourse(Course course) {				
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);		
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
	
}
