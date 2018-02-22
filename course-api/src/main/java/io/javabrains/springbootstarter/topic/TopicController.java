package io.javabrains.springbootstarter.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseService CourseService; 
	
	@RequestMapping("/Courses")
	public List<Course> getAllCourses()  {
		return CourseService.getAllCourses();
	}
	
	@RequestMapping("/Courses/{id}")
	public Course getCourse(@PathVariable String id)  {
		return CourseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/Courses")
	public void addCourse(@RequestBody Course Course)  {
		CourseService.addCourse(Course);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/Courses/{id}")
	public void addCourse(@RequestBody Course Course, @PathVariable String id)  {
		CourseService.updateCourse(Course, id);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/Courses/{id}")
	public void deleteCourse(@PathVariable String id)  {
		CourseService.deleteCourse(id);
	}
	
	
}
