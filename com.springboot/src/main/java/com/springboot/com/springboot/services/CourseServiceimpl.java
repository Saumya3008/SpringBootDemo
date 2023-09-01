package com.springboot.com.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.com.springboot.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {

	List<Course> list;

	public CourseServiceimpl() {

		list = new ArrayList<>();

		list.add(new Course(123, "java Core", "Java is a good programming language"));
	}

	@Override
	public List<Course> getCourses() {

		return list;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
