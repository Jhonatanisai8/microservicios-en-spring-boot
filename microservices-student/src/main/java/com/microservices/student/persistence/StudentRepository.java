package com.microservices.student.persistence;

import com.microservices.student.models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository
        extends CrudRepository<Student, Integer> {

    @Query("select s from Student s WHERE s.courseID = :courseId")
    List<Student> findAllStudent(Long courseId);

    // List<Student> findAllByCourseID(Long courseID);
}
