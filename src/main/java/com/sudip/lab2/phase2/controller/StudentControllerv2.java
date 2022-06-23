package com.sudip.lab2.phase2.controller;


import com.sudip.lab2.phase2.dto.StudentDTO;
import com.sudip.lab2.phase2.services.StudentServicev2;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/v2/students")

public class StudentControllerv2 {
    private final StudentServicev2 studentService;

    @GetMapping
    public List<StudentDTO> findAll() {
        return studentService.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody StudentDTO studentDTO) {
        studentService.create(studentDTO);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody StudentDTO studentDto, @PathVariable int id) {
        studentService.update(studentDto, id);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable int id) {
        studentService.remove(id);
    }
}
