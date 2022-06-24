package com.example.rest.phaseI.controller;

import com.example.rest.phaseI.entity.Course;
import com.example.rest.phaseI.entity.Student;
import com.example.rest.phaseI.repo.StudentRepo;
import com.example.rest.phaseI.service.StudentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/students")

public class StudentController {
    private final StudentServiceImpl studentService;

    @GetMapping("/{major}")
    public List<Student> findStudnetsByMajor(@PathVariable String major) {
        return studentService.getStudentsByMajor(major);
    }


    @GetMapping("/{id}/courses")
    public List<Course> getCoursesByStudentId(@PathVariable int id) {
        return studentService.getCoursesByStudentId(id);
    }
}
