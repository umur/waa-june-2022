package com.sudip.lab2.phase4.controller;

import com.sudip.lab2.phase4.dto.StudentDTOv4;
import com.sudip.lab2.phase4.services.StudentServicev4;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/v4/students")

public class StudentControllerv4 {
    private final StudentServicev4 studentService;

    @GetMapping
    public List<StudentDTOv4> findAll() {
        return studentService.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody StudentDTOv4 studentDTO) {
        studentService.create(studentDTO);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody StudentDTOv4 studentDto, @PathVariable int id) {
        studentService.update(studentDto, id);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable int id) {
        studentService.remove(id);
    }
}
