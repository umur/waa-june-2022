package com.Lab02.Assignment.Phase3.controller;
import com.Lab02.Assignment.Phase3.dtos.StudentDto;
import com.Lab02.Assignment.Phase3.service.StudentService3;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/v3/students")
public class StudentController3 {

    private final StudentService3 studentService;

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
