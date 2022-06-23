package com.example.demowaa.controller;

import com.example.demowaa.Dto.StudentDto;
import com.example.demowaa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/students")
    public List<StudentDto> findAll(){
        return studentService.findAll();
    }
    @PostMapping("/student")
    public void create(@RequestBody StudentDto s){
        studentService.create(s);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return studentService.delete(id);
    }
    @PutMapping("/{id}")
    public boolean update(@RequestBody StudentDto s,@PathVariable int id){
        return studentService.update(s,id);
    }

}
