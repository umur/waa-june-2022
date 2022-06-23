package com.sudip.lab2.phase3.services;

import com.sudip.lab2.phase3.dto.CourseDTO;
import com.sudip.lab2.phase3.entity.Course;
import com.sudip.lab2.phase3.repository.CourseRepositoryv3;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImplv3 implements CourseServicev3 {
    private final CourseRepositoryv3 courseRepository;
    private final ModelMapper modelMapper;

    @Override
    public void create(CourseDTO courseDTO) {
        courseRepository.create(modelMapper.map(courseDTO, Course.class));

    }

    @Override
    public List<CourseDTO> findAll() {
        List<Course> listOfCourse = courseRepository.findAll();
        List<CourseDTO> courseDTOList = new ArrayList<>();
        listOfCourse.forEach(course -> {
            CourseDTO courseDTO1 = modelMapper.map(course, CourseDTO.class);
            courseDTOList.add(courseDTO1);
        });
        return courseDTOList;
    }


    @Override
    public void update(CourseDTO courseDTO, int id) {
        Course course = modelMapper.map(courseDTO, Course.class);
        courseRepository.update(course, id);
    }

    @Override
    public void remove(int id) {
        courseRepository.remove(id);
    }
}
