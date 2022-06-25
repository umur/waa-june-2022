package com.waa.phase3.mapper;

import com.waa.phase3.dto.CourseDTO;
import com.waa.phase3.entity.Course;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseMapper {

    private final ModelMapper modelMapper;

    public CourseDTO toDTO(Course course) {
        return modelMapper.map(course, CourseDTO.class);
    }

    public Course toCourse(CourseDTO dto) {
        return modelMapper.map(dto, Course.class);
    }
}
