package com.example.rest.phaseIII.dto;

import com.example.rest.phaseIII.entity.Course;
import lombok.Data;

@Data
public class CourseDto {
    private int id;
    private String name;
    private String code;

}
