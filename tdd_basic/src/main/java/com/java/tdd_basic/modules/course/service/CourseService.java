package com.java.tdd_basic.modules.course.service;

import org.springframework.stereotype.Service;

import com.java.tdd_basic.modules.course.entity.Course;
import com.java.tdd_basic.modules.course.repository.ICourseRepository;

@Service
public class CourseService {
	
	private ICourseRepository repository;
	
	public CourseService(ICourseRepository repository) {
		super();
		this.repository = repository;
	}

	public Course execute(Course course) {
		if (repository.findByName(course.getName()) != null) {
			throw new Error("Course exists");
		}

		return repository.save(course);
	}

}
