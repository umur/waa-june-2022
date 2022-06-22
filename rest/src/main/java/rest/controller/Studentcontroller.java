package rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.entity.Student;
import rest.entity.course;
import rest.service.studentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/")
public class Studentcontroller {
    private final studentService studentService;

    @RequestMapping("students")
    public ResponseEntity<List<Student>> getAll(){
        return ResponseEntity.status(200).body(studentService.getAll());
    }
    @RequestMapping("/students/{id}")
    public void delete(@PathVariable int id){
        studentService.delete(id);
    }
    @RequestMapping("/students/{id}")
    public void save(@PathVariable Student s){
        studentService.save(s);
    }
    public List<course> getCourseByStudentId(@PathVariable int id){
        return studentService.getCourseByStudent(id);
    }

}
