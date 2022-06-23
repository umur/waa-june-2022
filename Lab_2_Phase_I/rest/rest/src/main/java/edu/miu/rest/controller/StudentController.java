package edu.miu.rest.controller;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import edu.miu.rest.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("")
    public List<Student> gelAllStudents()
    {
        return studentService.findAll();
    }

    @PostMapping("")
    public void createStudent(@RequestBody Student student)
    {
        studentService.create(student);
    }

    @PutMapping("/{id}")
    public void updateStudent(@RequestBody Student student , @PathVariable int id)
    {
        List<Student> students = studentService.findAll();
        for(Student s : students)
        {
            if(s.getId() == student.getId())
            {
                studentService.update(student);
            }
        }
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id)
    {
        List<Student> students = studentService.findAll();
        for(Student s : students)
        {
            if(s.getId() == id)
            {
                studentService.delete(s);
            }
        }

    }

    @GetMapping("")
    public List<Student> getStudentsByMajor(@RequestParam String major)
    {
        return studentService.getStudentsByMajor(major);
    }

    @GetMapping("/{id}/courses")
    public List<Course> getCoursesByStudentId(@PathVariable int studentId)
    {
        return studentService.getCoursesByStudentId(studentId);
    }

}
