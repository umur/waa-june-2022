package com.waa.phase2.controller;


import com.waa.phase2.dto.CourseDTO;
import com.waa.phase2.dto.StudentDTO;
import com.waa.phase2.entity.Course;
import com.waa.phase2.entity.Student;
import com.waa.phase2.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    public final StudentService studentService;

    @PostMapping
    public Integer create(@RequestBody StudentDTO student) {
        return studentService.create(student);
    }

    @GetMapping("/student-by-major")
    public List<StudentDTO> getStudentByMajor(@RequestParam(value = "major", required = false) String major) {
        return studentService.getStudentsByMajor(major);
    }

    @GetMapping("/get-courses-by-student-id")
    public List<CourseDTO> getCoursesByStudentId(@RequestParam Integer id) {
        return studentService.getCoursesByStudentId(id);
    }


}
