package com.Lab02.Assignment.Phase4.controller;
import com.Lab02.Assignment.Phase4.dtos.StudentDto;
import com.Lab02.Assignment.Phase4.service.StudentService4;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/v4/students")
public class StudentController4 {

    private final StudentService4 studentService;

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
