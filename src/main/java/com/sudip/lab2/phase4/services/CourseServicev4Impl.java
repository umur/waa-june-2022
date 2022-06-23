package com.sudip.lab2.phase4.services;

import com.sudip.lab2.phase4.dto.CourseDTOv4;
import com.sudip.lab2.phase4.entity.Course;
import com.sudip.lab2.phase4.repository.CourseRepositoryv4;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServicev4Impl implements CourseServicev4 {
    private final CourseRepositoryv4 courseRepository;
    private final ModelMapper modelMapper;

    @Override
    public void create(CourseDTOv4 courseDTO) {
        courseRepository.create(modelMapper.map(courseDTO, Course.class));

    }

    @Override
    public List<CourseDTOv4> findAll() {
        List<Course> listOfCourse = courseRepository.findAll();
        List<CourseDTOv4> courseDTOList = new ArrayList<>();
        listOfCourse.forEach(course -> {
            CourseDTOv4 courseDTO1 = modelMapper.map(course, CourseDTOv4.class);
            courseDTOList.add(courseDTO1);
        });
        return courseDTOList;
    }


    @Override
    public void update(CourseDTOv4 courseDTO, int id) {
        Course course = modelMapper.map(courseDTO, Course.class);
        courseRepository.update(course, id);
    }

    @Override
    public void remove(int id) {
        courseRepository.remove(id);
    }
}
