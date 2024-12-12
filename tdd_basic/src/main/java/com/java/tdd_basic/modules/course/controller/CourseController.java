package com.java.tdd_basic.modules.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.tdd_basic.modules.course.entity.Course;
import com.java.tdd_basic.modules.course.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	CourseService service;

	protected CourseController(CourseService service) {
		super();
		this.service = service;
	}

	@PostMapping("/")
	public Course create(@RequestBody Course course) {
		return service.execute(course);
	}

}
