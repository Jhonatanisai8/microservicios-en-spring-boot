package com.microservices.student.service.implementation;

import com.microservices.student.models.Student;
import com.microservices.student.persistence.StudentRepository;
import com.microservices.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IStudentServiceImple
        implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> findAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> findByCourseId(Long courseId) {
        return studentRepository.findAllStudent(courseId);
    }
}
