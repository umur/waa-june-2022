package com.phase4.controller;

import com.phase4.dto.CourseDto;
import com.phase4.dto.StudentDto;
import com.phase4.service.impl.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<StudentDto> getAll() {
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public StudentDto getById(@PathVariable Long id) {
        return studentService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        studentService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody StudentDto p, @PathVariable Long id) {
        studentService.update(id, p);
    }

    @PostMapping
    public void save(@RequestBody StudentDto p) {
        studentService.save(p);
    }

}