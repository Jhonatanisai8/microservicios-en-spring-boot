package com.microservices.courses.controller;

import com.microservices.courses.http.response.StudentByCourseResponse;
import com.microservices.courses.models.Course;
import com.microservices.courses.service.implementation.CourseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseServiceImp courseServiceImp;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/allCourses")
    public ResponseEntity<?> getAllCourses() {
        List<Course> courses = courseServiceImp.getAllCourses();
        System.out.println("Hi");
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @GetMapping("/search/{courseId}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> findCourseById(@PathVariable Long courseId) {
        Course course = courseServiceImp.findCourseById(courseId);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/createCourse")
    public void saveCourse(@RequestBody Course course) {
        courseServiceImp.saveCourse(course);
    }

    @GetMapping("/searchStudent/{courseId}")
    public ResponseEntity<?> findStudentsByCourseId(@PathVariable Long courseId) {
        StudentByCourseResponse student = courseServiceImp.findStudentsByCourseId(courseId);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

}
