package com.java.tdd_basic.modules.course.repository;

import com.java.tdd_basic.modules.course.entity.Course;

public interface ICourseRepository {
	
	public Course findByName(String name);
	public Course save(Course course);
}
