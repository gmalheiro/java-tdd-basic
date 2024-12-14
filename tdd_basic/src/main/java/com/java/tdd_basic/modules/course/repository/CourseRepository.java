package com.java.tdd_basic.modules.course.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.tdd_basic.modules.course.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, UUID> {
	public Course findByName(String name);
}
