package edu.miu.rest.controller;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
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
    public List<Student> getStudentsByMajor(@RequestParam String major){
       return studentService.getStudentsByMajor(major);
    }

    // http://localhost:8080/students/courses/search?id=101
    @GetMapping(value = "/courses/search")
    @ResponseBody
    public List<Course> getCoursesByStudentId(@RequestParam int id){
        return studentService.getCoursesByStudentId(id);
    }
    // http://localhost:8080/students/findAll
    @GetMapping("/findAll")
    public List<Student> findAllProducts() {
        return studentService.findAll();
    }

    // http://localhost:8080/students/create
    @PostMapping("/create")
    public void create(@RequestBody Student entity){
        studentService.create(entity);
    }

    // http://localhost:8080/students/update/101
    @PutMapping("/update/{id}")
    public void update(@RequestBody Student entity,
                       @PathVariable int id){
        studentService.update(entity,id);
    }
    // http://localhost:8080/students/delete/102
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        studentService.delete(id);
    }
}
