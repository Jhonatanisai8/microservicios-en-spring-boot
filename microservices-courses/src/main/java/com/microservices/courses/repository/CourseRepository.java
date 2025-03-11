package com.microservices.courses.repository;

import com.microservices.courses.models.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository
        extends CrudRepository<Course, Long> {
}
