package com.microservices.student.service;

import com.microservices.student.models.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAllStudents();

    Student findStudentById(Long id);

    Student saveStudent(Student student);

    List<Student> findByCouseId(Long courseId);
}
