package com.waa.phase2.service.impl;

import com.waa.phase2.dto.CourseDTO;
import com.waa.phase2.entity.Course;
import com.waa.phase2.repository.CourseRepository;
import com.waa.phase2.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public CourseDTO findById(Integer id) {
        return CourseDTO.toDTO(courseRepository.findById(id));
    }

    @Override
    public List<CourseDTO> findAll() {
        return courseRepository.findAll()
                .stream()
                .map(CourseDTO::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Integer create(CourseDTO courseDTO) {

        return courseRepository.save(CourseDTO.toCourse(courseDTO));
    }

    @Override
    public void update(Integer id, CourseDTO courseDTO) {
        courseRepository.update(id, CourseDTO.toCourse(courseDTO));
    }

    @Override
    public void delete(Integer id) {
        courseRepository.delete(id);
    }
}
