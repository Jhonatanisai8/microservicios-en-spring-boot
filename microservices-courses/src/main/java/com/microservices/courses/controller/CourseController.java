package com.microservices.courses.controller;

import com.microservices.courses.models.Course;
import com.microservices.courses.service.implementation.CourseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/courses")
public class CourseController {

    @Autowired
    private CourseServiceImp courseServiceImp;

    @RequestMapping(method = RequestMethod.GET)
    @GetMapping("/allCourses")
    public ResponseEntity<?> getAllCourses() {
        List<Course> courses = courseServiceImp.getAllCourses();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @GetMapping("/search/{courseId}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> findCourseById(Long courseId) {
        Course course = courseServiceImp.findCourseById(courseId);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/createCourse")
    public void saveCourse(@RequestBody Course course) {
        courseServiceImp.saveCourse(course);
    }

}
