package edu.miu.rest.controller;

import edu.miu.rest.dto.CourseDto;
import edu.miu.rest.dto.StudentDto;
import edu.miu.rest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class Controller {

    private final StudentService studentService;

   @Autowired // optional
   public Controller(StudentService studentService){
       this.studentService=studentService;
   }

    // http://localhost:8080/students/search?major=CS
    @GetMapping(value = "/search")
    @ResponseBody
    public List<StudentDto> getStudentsByMajor(@RequestParam String major){
       return studentService.getStudentsByMajor(major);
    }

    // http://localhost:8080/students/courses/search?id=101
    @GetMapping(value = "/courses/search")
    @ResponseBody
    public List<CourseDto> getCoursesByStudentId(@RequestParam int id){
        return studentService.getCoursesByStudentId(id);
    }
    // http://localhost:8080/students/findAll
    @GetMapping("/findAll")
    public List<StudentDto> findAllProducts() {
        return studentService.findAll();
    }

    // http://localhost:8080/students/create
    @PostMapping("/create")
    public void create(@RequestBody StudentDto dto){
        studentService.create(dto);
    }

    // http://localhost:8080/students/update/101
    @PutMapping("/update/{id}")
    public void update(@RequestBody StudentDto dto,
                       @PathVariable int id){
        studentService.update(dto,id);
    }
    // http://localhost:8080/students/delete/102
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        studentService.delete(id);
    }
}
