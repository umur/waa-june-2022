package com.waa.phaseIII.controller;

import com.waa.phaseIII.dto.CourseDto;
import com.waa.phaseIII.dto.StudentDto;
import com.waa.phaseIII.service.StudentDtoMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentsMapperDto")
@CrossOrigin
public class StudentDtoMapperController {
    private StudentDtoMapperService studentDtoMapperService;

    @Autowired
    public StudentDtoMapperController(StudentDtoMapperService studentDtoMapperService) {
        this.studentDtoMapperService = studentDtoMapperService;
    }

    @GetMapping()
    public List<StudentDto> getAll() {
        return studentDtoMapperService.findAll();
    }

    @GetMapping("/majors/{major}")
    public List<StudentDto> getByMajor(@PathVariable String major) {
        return studentDtoMapperService.getByMajor(major);
    }

    @GetMapping("/courses/{id}")
    public List<CourseDto> getByMajor(@PathVariable int id) {
        return studentDtoMapperService.getCoursesByStudentId(id);
    }

    @PostMapping()
    public String save(@RequestBody StudentDto stu) {
        studentDtoMapperService.save(stu);
        return "Saved";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody StudentDto stu) {
        stu.setId(id);
        studentDtoMapperService.update(stu);
        return "Updated";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        studentDtoMapperService.delete(id);
        return "Deleted";
    }
}
