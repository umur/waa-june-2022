package com.lab.phase2.controller;

import com.lab.phase2.dto.StudentDto;
import com.lab.phase2.model.Course;
import com.lab.phase2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentDto> findAllStudents() {return studentService.findAll();}

    @PostMapping
    public void create(@RequestBody StudentDto dto) {
        studentService.create(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        studentService.delete(id);
    }

    @PutMapping("/{id}")
    public StudentDto update(@RequestBody StudentDto studentDto, @PathVariable int id) {
        return studentService.update(studentDto, id);
    }

    @GetMapping("/search")
    public List<StudentDto> getStudentByMajor(@RequestParam(name="major") String major) {
        return studentService.findByMajor(major);
    }

    @GetMapping("{id}/course")
    public List<Course> getCoursesByStudentId(@PathVariable int id) {
        return studentService.findCoursesByStudentId(id);
    }
}
