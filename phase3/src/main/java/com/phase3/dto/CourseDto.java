package com.phase3.dto;

import com.phase3.domain.Course;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class CourseDto {

    private Long id;
    private String name;
    private String code;
}
