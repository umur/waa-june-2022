package com.example.lab2.phase2.service;


import com.example.lab2.phase2.DTO.CourseDTO;
import com.example.lab2.phase2.entity.Course;
import com.example.lab2.phase2.repository.CourseRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<CourseDTO> getCoursesByStudentId(int studentId) {
        return courseRepository.findAllCoursesByStudentId(studentId).stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<CourseDTO> findAll() {
        return courseRepository.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void createCourse(CourseDTO courseDTO) {
        courseRepository.create(toEntity(courseDTO));
    }

    @Override
    public void updateCourse(CourseDTO courseDTO) {
        courseRepository.updateCourse(toEntity(courseDTO));
    }

    @Override
    public void deleteCourse(int id) {
        courseRepository.deleteCourse(id);
    }

    public CourseDTO toDTO(Course course) {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setName(course.getName());
        courseDTO.setCode(course.getCode());
        return courseDTO;
    }

    public Course toEntity(CourseDTO courseDTO){
        Course course = new Course();
        course.setName(courseDTO.getName());
        course.setCode(courseDTO.getCode());
        return course;
    }
}
