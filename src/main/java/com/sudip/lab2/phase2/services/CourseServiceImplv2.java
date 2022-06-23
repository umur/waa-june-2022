package com.sudip.lab2.phase2.services;

import com.sudip.lab2.phase2.dto.CourseDTO;
import com.sudip.lab2.phase2.entity.Course;
import com.sudip.lab2.phase2.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImplv2 implements CourseServicev2 {
    private final CourseRepository courseRepository;

    @Override
    public void create(CourseDTO courseDTO) {
        Course course = courseDTO.toEntity();
        courseRepository.create(course);
    }

    @Override
    public List<CourseDTO> findAll() {
        List<Course> listOfCourse = courseRepository.findAll();
        CourseDTO courseDTO = new CourseDTO();
        List<CourseDTO> courseDTOList = new ArrayList<>();
        listOfCourse.forEach(course -> {
            CourseDTO courseDTO1 = courseDTO.courseDTO(course);
            courseDTOList.add(courseDTO1);
        });
        return courseDTOList;
    }


    @Override
    public void update(CourseDTO courseDTO, int id) {
        Course course = courseDTO.toEntity();
        courseRepository.update(course, id);
    }

    @Override
    public void remove(int id) {
        courseRepository.remove(id);
    }
}
