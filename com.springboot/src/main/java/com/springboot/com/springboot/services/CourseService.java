package com.springboot.com.springboot.services;

import java.util.List;

import com.springboot.com.springboot.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course addCourse(Course course);

}
