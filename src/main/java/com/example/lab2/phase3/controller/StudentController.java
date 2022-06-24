package com.example.lab2.phase3.controller;


import com.example.lab2.phase3.DTO.StudentDTO;
import com.example.lab2.phase3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public void createStudent(@RequestBody StudentDTO studentDTO) {
        studentService.createStudent(studentDTO);
    }

    @GetMapping("/delete")
    public void deleteStudent(@RequestParam int id) {
        studentService.deleteStudent(id);
    }

    @GetMapping("/all")
    public List<StudentDTO> findAllServices() {
        return studentService.findAll();
    }

    @GetMapping("/search")
    public List<StudentDTO> findStudentsByMajor(@RequestParam String major) {
        return studentService.getStudentsByMajor(major);
    }


}
