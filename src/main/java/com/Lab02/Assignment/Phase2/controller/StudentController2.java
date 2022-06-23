package com.Lab02.Assignment.Phase2.controller;
import com.Lab02.Assignment.Phase2.dtos.StudentDto;
import com.Lab02.Assignment.Phase2.entity.Student;
import com.Lab02.Assignment.Phase2.service.StudentService2;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/v2/students")
public class StudentController2 {

    private final StudentService2 studentService;

    @PostMapping
    public void save(@RequestBody StudentDto s){
        studentService.saveStudent(s);
    }

    @GetMapping
    public List<StudentDto> getAll(){
        return  studentService.getAllStudents();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        studentService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody StudentDto s){
        studentService.update(s, id);
    }


}
