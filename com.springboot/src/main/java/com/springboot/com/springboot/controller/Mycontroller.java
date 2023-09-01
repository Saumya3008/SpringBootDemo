package com.springboot.com.springboot.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.com.springboot.entities.Course;
import com.springboot.com.springboot.services.CourseService;

@RestController
public class Mycontroller {

	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {

		return "Checking the api";
	}

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
		 return this.courseService.addCourse(course);
	}

}
