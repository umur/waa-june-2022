package com.waa.lab.one.phase.two.service.impl;

import com.waa.lab.one.phase.two.dto.CourseDTO;
import com.waa.lab.one.phase.two.entiry.Course;
import com.waa.lab.one.phase.two.repo.CourseRepository;
import com.waa.lab.one.phase.two.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public List<CourseDTO> findAll() {
        return courseRepository.findAll()
                .stream()
                .map(CourseDTO::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CourseDTO findById(Long id) {
        return CourseDTO.toDTO(courseRepository.findById(id));
    }

    @Override
    public Long create(CourseDTO courseDTO) {
        return courseRepository.save(CourseDTO.toCourse(courseDTO));
    }

    @Override
    public void update(Long id, CourseDTO course) {
        courseRepository.update(id, CourseDTO.toCourse(course));
    }

    @Override
    public void delete(Long id) {
        courseRepository.delete(id);
    }
}
