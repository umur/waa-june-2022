package com.example.rest.phaseIV.controller;

import com.example.rest.phaseIII.entity.Student;
import com.example.rest.phaseIV.dto.CourseDto;
import com.example.rest.phaseIV.dto.StudentDto;
import com.example.rest.phaseIV.service.StudentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
//    @PostMapping("/add")
//    public void addNewStudent(@RequestBody Student student){
//
//    }
}
