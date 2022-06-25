package com.waa.phase3.service.impl;

import com.waa.phase3.dto.CourseDTO;
import com.waa.phase3.mapper.CourseMapper;
import com.waa.phase3.repository.CourseRepository;
import com.waa.phase3.service.CourseService;
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
    public CourseDTO findById(Integer id) {
        return courseMapper.toDTO(courseRepository.findById(id));
    }

    @Override
    public Integer create(CourseDTO courseDTO) {
        return courseRepository.save(courseMapper.toCourse(courseDTO));
    }

    @Override
    public void update(Integer id, CourseDTO courseDTO) {
        courseRepository.update(id, courseMapper.toCourse(courseDTO));
    }

    @Override
    public void delete(Integer id) {
        courseRepository.delete(id);
    }
}
