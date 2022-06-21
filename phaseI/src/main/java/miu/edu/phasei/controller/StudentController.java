package miu.edu.phasei.controller;

import miu.edu.phasei.entity.Course;
import miu.edu.phasei.entity.Student;
import miu.edu.phasei.service.StudentService;
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
    public ResponseEntity<List<Student>> findAll(){
        var students = studentService.findAll();
        return ResponseEntity.ok().body(students);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> findById(@PathVariable int id){
        var student = studentService.findOne(id);
        return ResponseEntity.ok(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@RequestBody Student student, @PathVariable int id){
        var updateStudent = studentService.update(student, id);
        return ResponseEntity.ok(updateStudent);
    }

    @PostMapping()
    public ResponseEntity<Student> create(@RequestBody Student student){
        student = studentService.create(student);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        studentService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/students/{id}/courses")
    public ResponseEntity<List<Course>> findStudentCourse(@PathVariable int id){
        var courses = studentService.getCoursesByStudentId(id);
        return ResponseEntity.ok().body(courses);
    }

//    @GetMapping()
//    public ResponseEntity<List<Student>> findStudentByMajor(@RequestParam String major){
//        var students = studentService.getStudentsByMajor(major);
//        return ResponseEntity.ok().body(students);
//    }
}
