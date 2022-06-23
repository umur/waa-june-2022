package com.waa.lab.one.phase.three.mapper;

import com.waa.lab.one.phase.three.dto.CourseDTO;
import com.waa.lab.one.phase.three.entiry.Course;
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
