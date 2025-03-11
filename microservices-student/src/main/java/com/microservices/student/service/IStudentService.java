package com.microservices.student.service;

import com.microservices.student.models.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAllStudents();

    Student findStudentById(Long id);

    void saveStudent(Student student);

    List<Student> findByCourseId(Long courseId);
}
