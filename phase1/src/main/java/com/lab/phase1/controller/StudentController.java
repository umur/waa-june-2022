package com.lab.phase1.controller;

import com.lab.phase1.model.Student;
import com.lab.phase1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> findAllStudents() {return studentService.findAll();}

    @PostMapping
    public Student create(@RequestBody Student student) {
        studentService.create(student);
        return student;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {

        return ResponseEntity.ok("Deleted");
    }

}
