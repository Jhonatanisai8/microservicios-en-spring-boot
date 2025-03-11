package com.microservices.courses.client;

import com.microservices.courses.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost:8090/api/student/searchMyCourse/{courseId}")
public interface StudentClient {

    @GetMapping("/searchMyCourse/{courseId}")
    List<StudentDto> findAllStudentByCourse(@PathVariable Long courseId);
}
