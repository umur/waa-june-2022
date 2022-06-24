package com.example.rest.phaseII.controller;

import com.example.rest.phaseII.dto.CourseDto;
import com.example.rest.phaseII.dto.StudentDto;
import com.example.rest.phaseII.entity.Course;
import com.example.rest.phaseII.entity.Student;
import com.example.rest.phaseII.service.StudentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/students")

public class StudentController {
    private final StudentServiceImpl studentService;

    @GetMapping("/{major}")
    public List<StudentDto> findStudnetsByMajor(@PathVariable String major) {
        return studentService.getStudentsByMajor(major);
    }


    @GetMapping("/{id}/courses")
    public List<CourseDto> getCoursesByStudentId(@PathVariable int id) {
        return studentService.getCoursesByStudentId(id);
    }
}
