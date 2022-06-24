package rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.DTO.courseDto;
import rest.entity.course;
import rest.service.courseService;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class coursecontroller {
    private final courseService courseService;

    @GetMapping("/courses")
    public ResponseEntity<List<courseDto>> findAll(){

        return ResponseEntity.status(200).body(courseService.getAll());
    }
    @RequestMapping("/courses/{id}")
    public courseDto getById(@PathVariable int id){
        return courseService.getById(id);
    }
    @RequestMapping("courses")
    public void save(@PathVariable courseDto s){
        courseService.save(s);
    }
    @RequestMapping("/coursers/{id}")
    public void delete(@PathVariable int id){
        courseService.delete(id);
    }
}
