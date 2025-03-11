package com.microservices.courses.service.implementation;

import com.microservices.courses.models.Course;
import com.microservices.courses.repository.CourseRepository;
import com.microservices.courses.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImp
        implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findCourseById(Long courseId) {
        return courseRepository.findById(courseId).orElseThrow();
    }

    @Override
    public void saveCourse(Course course) {
        courseRepository.save(course);
    }
}
