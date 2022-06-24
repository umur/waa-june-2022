package miu.edu.restdto.lab1phase2.controller;

import miu.edu.restdto.lab1phase2.dto.StudentDto;
import miu.edu.restdto.lab1phase2.entity.Student;
import miu.edu.restdto.lab1phase2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentDto> findAll(){
        return studentService.findAll();
    }

    @PostMapping
    public void create(@RequestBody StudentDto student){
        studentService.create(student);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody StudentDto student, @PathVariable int id){
        studentService.update(id, student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        studentService.delete(id);
    }

}

