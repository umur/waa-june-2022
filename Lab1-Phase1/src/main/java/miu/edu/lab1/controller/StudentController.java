package miu.edu.lab1.controller;

import miu.edu.lab1.entity.Student;
import miu.edu.lab1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> findAll(){
        var students = studentService.findAll();
        return students;
    }

    @PostMapping
    public void create(@RequestBody Student student){
        studentService.create(student);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Student student, @PathVariable int id){
        studentService.update(id, student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        studentService.delete(id);
    }

}

