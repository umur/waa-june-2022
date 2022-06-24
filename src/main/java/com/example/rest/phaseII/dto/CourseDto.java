package com.example.rest.phaseII.dto;

import com.example.rest.phaseII.entity.Course;
import lombok.Data;

@Data
public class CourseDto {
    private int id;
    private String name;
    private String code;

    public CourseDto toDto(Course course) {
        CourseDto dto = new CourseDto();
        dto.setId(course.getId());
        dto.setName(course.getCode());
        dto.setName(course.getName());
        return dto;
    }

    public Course toEntity() {
        Course course = new Course();
        course.setId(this.id);
        course.setName(this.name);
        course.setCode(this.code);
        return course;
    }
}
