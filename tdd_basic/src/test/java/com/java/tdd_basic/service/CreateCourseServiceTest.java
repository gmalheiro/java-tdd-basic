package com.java.tdd_basic.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.java.tdd_basic.modules.course.repository.CourseInMemoryRepository;
import org.junit.jupiter.api.Test;

import com.java.tdd_basic.modules.course.entity.Course;
import com.java.tdd_basic.modules.course.service.CourseService;

public class CreateCourseServiceTest {

	@Test
	public void should_be_able_to_create_a_new_course() {
		Course course = new Course();
		course.setDescription("Course_Description_Test");
		course.setName("Course_Name");
		course.setWorkload(100);
		CourseInMemoryRepository repository = new CourseInMemoryRepository();
		CourseService createCourseService = new CourseService(repository);
		Course createdCourse = createCourseService.execute(course);
		assertNotNull(createdCourse.getId());
	}

}
