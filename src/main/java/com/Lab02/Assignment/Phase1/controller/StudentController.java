package com.Lab02.Assignment.Phase1.controller;
import com.Lab02.Assignment.Phase1.entity.Student;
import com.Lab02.Assignment.Phase1.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/v1/students")
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public void save(@RequestBody Student s){
        studentService.saveStudent(s);
    }

    @GetMapping
    public List<Student> getAll(){
        return  studentService.getAllStudents();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        studentService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Student s){
        studentService.update(s, id);
    }


}
