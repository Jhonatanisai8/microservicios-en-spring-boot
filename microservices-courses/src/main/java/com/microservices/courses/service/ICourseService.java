package com.microservices.courses.service;

import com.microservices.courses.http.response.StudentByCourseResponse;
import com.microservices.courses.models.Course;

import java.util.List;

public interface ICourseService {

    List<Course> getAllCourses();

    Course findCourseById(Long courseId);

    void saveCourse(Course course);

    StudentByCourseResponse findStudentsByCourseId(Long courseId);
}
