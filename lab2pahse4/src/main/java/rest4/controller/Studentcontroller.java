package rest4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest4.DTO.courseDto;
import rest4.DTO.studentDto;
import rest4.service.studentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/")
public class Studentcontroller {
    private final studentService studentService;
    @RequestMapping("/students")
    public String getAll(Module module){
              model.addAttribute("listStudents",studentService.getAll());
        return "index";
    }

    @RequestMapping("/students/{id}")
    public ResponseEntity<studentDto> getById(@PathVariable int id){
        return ResponseEntity.status(200).body(studentService.getById(id));
    }
    @RequestMapping("/students/{id}")
    public void delete(@PathVariable int id){
        studentService.delete(id);
    }
    @RequestMapping("/students/{id}")
    public void save(@RequestBody studentDto s){
        studentService.save(s);
    }
    @GetMapping("/students/{id}")
    public List<courseDto> getCourseByStudentId(@PathVariable int id){
        return studentService.getCourseByStudent(id);
    }

}
