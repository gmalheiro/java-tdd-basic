package com.java.tdd_basic.modules.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.tdd_basic.modules.course.entity.Course;
import com.java.tdd_basic.modules.course.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository repository;

	public Course execute(Course course) {
		if (repository.findByName(course.getName()) != null) {
			throw new Error("Course exists");
		}

		return repository.save(course);

	}

}
