package com.example.lab2.phase1.controller;

import com.example.lab2.phase1.entity.Student;
import com.example.lab2.phase1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }



    @GetMapping
    public List<Student> findAllServices(){
        return studentService.findAll();
    }

    @GetMapping("/search")
    public List<Student> findStudentsByMajor(@RequestParam String major){
        return studentService.getStudentsByMajor(major);
    }
}
