package com.waa.lab.one.phase.one.controller;

import com.waa.lab.one.phase.one.entiry.Course;
import com.waa.lab.one.phase.one.entiry.Student;
import com.waa.lab.one.phase.one.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    public final StudentService studentService;

    @PostMapping
    public Long create(@RequestBody Student student) {
        return studentService.create(student);
    }

    @GetMapping("/student-by-major")
    public List<Student> getStudentByMajor(@RequestParam(value = "major", required = false) String major) {
        return studentService.getStudentsByMajor(major);
    }

    @GetMapping("/get-courses-by-student-id")
    public List<Course> getCoursesByStudentId(@RequestParam Long id) {
        return studentService.getCoursesByStudentId(id);
    }

}
