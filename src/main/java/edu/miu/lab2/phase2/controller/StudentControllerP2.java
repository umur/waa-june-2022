package edu.miu.lab2.phase2.controller;

import edu.miu.lab2.phase2.dto.StudentDto;
import edu.miu.lab2.phase2.entity.Student;
import edu.miu.lab2.phase2.service.studentservice.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phase2/students")
public class StudentControllerP2 {

    private final StudentService studentService;

    public StudentControllerP2(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentDto> getStudents() {
        return studentService.getStudent();
    }

    @PostMapping
    public void addStudent(@RequestBody StudentDto s) {
        studentService.createStudent(s);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("/{id}")
    public void updateStudent(@RequestBody StudentDto s, @PathVariable int id){
        studentService.updateStudent(s,id);
    }

}
