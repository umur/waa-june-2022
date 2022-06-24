package miu.edu.lab1phase3.controller;

import miu.edu.lab1phase3.dto.StudentDto;
import miu.edu.lab1phase3.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.IconUIResource;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/students")
public class StudentController {
    StudentService studentService;
    @Autowired
    private ModelMapper mapper;

    @Autowired
    public StudentController(StudentService studentService, ModelMapper mapper){
        this.studentService = studentService;
        this.mapper = mapper;
    }

    @GetMapping
    public List<StudentDto> findAll(){
        return studentService.findAll().stream().map(student ->mapper
                .map(student, StudentDto.class)).collect(Collectors.toList());
//        return studentService.findAll();
    }

    @PostMapping
    public void create(@RequestBody StudentDto student){
//        studentService.create(mapper.map(student, StudentDto.class));
        studentService.create(student);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody StudentDto student, @PathVariable int id){
//        studentService.update(id, mapper.map(student, StudentDto.class));
        studentService.update(id, student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        studentService.delete(id);
    }

}

