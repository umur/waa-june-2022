package com.waa.lab.one.phase.three.service.impl;

import com.waa.lab.one.phase.three.dto.CourseDTO;
import com.waa.lab.one.phase.three.mapper.CourseMapper;
import com.waa.lab.one.phase.three.repo.CourseRepository;
import com.waa.lab.one.phase.three.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    @Override
    public List<CourseDTO> findAll() {
        return courseRepository.findAll()
                .stream()
                .map(courseMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CourseDTO findById(Long id) {
        return courseMapper.toDTO(courseRepository.findById(id));
    }

    @Override
    public Long create(CourseDTO courseDTO) {
        return courseRepository.save(courseMapper.toCourse(courseDTO));
    }

    @Override
    public void update(Long id, CourseDTO course) {
        courseRepository.update(id, courseMapper.toCourse(course));
    }

    @Override
    public void delete(Long id) {
        courseRepository.delete(id);
    }
}
