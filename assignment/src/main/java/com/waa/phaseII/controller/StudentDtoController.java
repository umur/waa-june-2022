package com.waa.phaseII.controller;

import com.waa.phaseII.dto.CourseDto;
import com.waa.phaseII.dto.StudentDto;
import com.waa.phaseII.service.StudentDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentsDto")
public class StudentDtoController {
    private StudentDtoService studentDtoService;

    @Autowired
    public StudentDtoController(StudentDtoService studentDtoService) {
        this.studentDtoService = studentDtoService;
    }

    @GetMapping()
    public List<StudentDto> getAll() {
        return studentDtoService.findAll();
    }

    @GetMapping("/majors/{major}")
    public List<StudentDto> getByMajor(@PathVariable String major) {
        return studentDtoService.getByMajor(major);
    }

    @GetMapping("/courses/{id}")
    public List<CourseDto> getByMajor(@PathVariable int id) {
        return studentDtoService.getCoursesByStudentId(id);
    }

    @PostMapping()
    public String save(@RequestBody StudentDto stu) {
        studentDtoService.save(stu);
        return "Saved";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody StudentDto stu) {
        stu.setId(id);
        studentDtoService.update(stu);
        return "Updated";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        studentDtoService.delete(id);
        return "Deleted";
    }
}
