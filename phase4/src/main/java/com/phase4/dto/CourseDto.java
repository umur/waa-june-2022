package com.phase4.dto;

import com.phase4.domain.Course;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class CourseDto {

    private Long id;
    private String name;
    private String code;
}
