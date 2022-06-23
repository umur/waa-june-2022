package edu.miu.lab2.phase3.controller;

import edu.miu.lab2.phase3.dto.StudentDtoP3;
import edu.miu.lab2.phase3.service.studentservice.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phase3/students")
@CrossOrigin
public class StudentControllerP3 {

    private final StudentService studentService;

    public StudentControllerP3(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentDtoP3> getStudents() {
        return studentService.getStudent();
    }

    @PostMapping
    public void addStudent(@RequestBody StudentDtoP3 s) {
        studentService.createStudent(s);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("/{id}")
    public void updateStudent(@RequestBody StudentDtoP3 s, @PathVariable int id){
        studentService.updateStudent(s,id);
    }

}
