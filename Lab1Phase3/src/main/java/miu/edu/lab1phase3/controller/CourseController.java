package miu.edu.lab1phase3.controller;


import miu.edu.lab1phase3.dto.CourseDto;
import miu.edu.lab1phase3.entity.Course;
import miu.edu.lab1phase3.service.CourseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @Autowired
    private ModelMapper mapper;

    @Autowired // optional
    public CourseController(CourseService courseService, ModelMapper mapper) {
        this.courseService = courseService;
        this.mapper = mapper;
    }

    // http://localhost:8080/courses
    @GetMapping
    public List<CourseDto> findAll() {
//        return courseService.findAll().stream()
//                .map(course ->mapper.map(course, CourseDto.class)).collect(Collectors.toList());
        return courseService.findAll();
    }

    @PostMapping
    public void create(@RequestBody CourseDto course) {
//        courseService.create(mapper.map(course, CourseDto.class));
        courseService.create(course);

    }

    @PutMapping("/{id}")
    public void update(@RequestBody CourseDto course,
                       @PathVariable int id) {
//        courseService.update(id, mapper.map(course, CourseDto.class));
        courseService.update(id, course);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        courseService.delete(id);
    }
}
