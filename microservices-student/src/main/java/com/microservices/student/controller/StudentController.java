package com.microservices.student.controller;

import com.microservices.student.models.Student;
import com.microservices.student.service.implementation.IStudentServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private IStudentServiceImple studentServiceImple;

    @GetMapping("/allStudents")
    public ResponseEntity<?> findAllStudents() {
        return ResponseEntity.ok(studentServiceImple.findAllStudents());
    }

    @GetMapping("/searchStudent/{idStudent}")
    public ResponseEntity<?> findStudentById(@PathVariable Long idStudent) {
        return ResponseEntity.ok(studentServiceImple.findStudentById(idStudent));
    }

    @PostMapping("/createStudent")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student) {
        studentServiceImple.saveStudent(student);
    }

    @GetMapping("/searchMyCourse/{courseId}")
    public ResponseEntity<?> findByCourseId(@PathVariable Long courseId) {
        return ResponseEntity.ok(studentServiceImple.findByCourseId(courseId));
    }

}
