package com.java.tdd_basic.modules.course.repository;

import com.java.tdd_basic.modules.course.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository implements ICourseRepository{

    @Autowired
    CourseJpaRepository repository;

    @Override
    public Course findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public Course save(Course course) {
        return this.repository.save(course);
    }
}
