package com.waa.phase1.controller;


import com.waa.phase1.entity.Course;
import com.waa.phase1.entity.Student;
import com.waa.phase1.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    public final StudentService studentService;

    @PostMapping
    public Integer create(@RequestBody Student student) {
        return studentService.create(student);
    }

    @GetMapping("/student-by-major")
    public List<Student> getStudentByMajor(@RequestParam(value = "major", required = false) String major) {
        return studentService.getStudentsByMajor(major);
    }

    @GetMapping("/get-courses-by-student-id")
    public List<Course> getCoursesByStudentId(@RequestParam Integer id) {
        return studentService.getCoursesByStudentId(id);
    }


}
