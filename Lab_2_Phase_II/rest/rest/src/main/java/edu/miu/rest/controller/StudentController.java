package edu.miu.rest.controller;

import edu.miu.rest.dto.CourseDto;
import edu.miu.rest.dto.StudentDto;
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
    public List<StudentDto> gelAllStudents()
    {
        return studentService.findAll();
    }

    @PostMapping("")
    public void createStudent(@RequestBody StudentDto student)
    {
        studentService.create(student);
    }

    @PutMapping("/{id}")
    public void updateStudent(@RequestBody StudentDto student , @PathVariable int id)
    {
        List<StudentDto> students = studentService.findAll();
        for(StudentDto s : students)
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
        List<StudentDto> students = studentService.findAll();
        for(StudentDto s : students)
        {
            if(s.getId() == id)
            {
                studentService.delete(s);
            }
        }

    }

    @GetMapping("")
    public List<StudentDto> getStudentsByMajor(@RequestParam String major)
    {
        return studentService.getStudentsByMajor(major);
    }

    @GetMapping("/{id}/courses")
    public List<CourseDto> getCoursesByStudentId(@PathVariable int studentId)
    {
        return studentService.getCoursesByStudentId(studentId);
    }

}
