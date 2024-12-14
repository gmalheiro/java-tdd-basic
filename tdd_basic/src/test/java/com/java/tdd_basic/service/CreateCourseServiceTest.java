package com.java.tdd_basic.service;

import com.java.tdd_basic.modules.course.repository.CourseInMemoryRepository;
import org.junit.jupiter.api.Test;

import com.java.tdd_basic.modules.course.entity.Course;
import com.java.tdd_basic.modules.course.service.CourseService;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test()
    public void should_not_be_able_to_create_a_new_course_if_exists() {
        Course course = new Course();
        course.setDescription("Not_Create_course");
        course.setName("Not_Create_course");
        course.setWorkload(100);
        CourseInMemoryRepository repository = new CourseInMemoryRepository();
        CourseService createCourseService = new CourseService(repository);
        createCourseService.execute(course);
        Error error = assertThrows(Error.class, () -> createCourseService.execute(course));
        assertTrue(error.getMessage().contains("Course exists"));
    }
}
