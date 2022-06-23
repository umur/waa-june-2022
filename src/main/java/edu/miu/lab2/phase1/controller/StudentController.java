package edu.miu.lab2.phase1.controller;

import edu.miu.lab2.phase1.entity.Student;
import edu.miu.lab2.phase1.service.studentservice.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudent();
    }

    @PostMapping
    public void addStudent(@RequestBody Student s) {
        studentService.createStudent(s);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("/{id}")
    public void updateStudent(@RequestBody Student s, @PathVariable int id){
        studentService.updateStudent(s,id);
    }

}
