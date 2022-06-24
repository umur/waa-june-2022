package miu.edu.phase2.controller;


import miu.edu.phase2.dto.CourseDto;
import miu.edu.phase2.dto.StudentDto;
import miu.edu.phase2.entity.Course;
import miu.edu.phase2.entity.Student;
import miu.edu.phase2.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping()
    public ResponseEntity<List<StudentDto>> findAll(){
        var students = studentService.findAll();
        return ResponseEntity.ok().body(students);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> findById(@PathVariable int id){
        var student = studentService.findOne(id);
        return ResponseEntity.ok(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> update(@RequestBody StudentDto student, @PathVariable int id){
        var updateStudent = studentService.update(student, id);
        return ResponseEntity.ok(updateStudent);
    }

    @PostMapping()
    public ResponseEntity<StudentDto> create(@RequestBody StudentDto student){
        student = studentService.create(student);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        studentService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/students/{id}/courses")
    public ResponseEntity<List<CourseDto>> findStudentCourse(@PathVariable int id){
        var courses = studentService.getCoursesByStudentId(id);
        return ResponseEntity.ok().body(courses);
    }

    @GetMapping()
    @ResponseBody
    public ResponseEntity<List<StudentDto>> findStudentByMajor(@RequestParam String major){
        var students = studentService.getStudentsByMajor(major);
        return ResponseEntity.ok().body(students);
    }
}
