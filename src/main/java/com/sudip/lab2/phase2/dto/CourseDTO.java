package com.sudip.lab2.phase2.dto;

import com.sudip.lab2.phase2.entity.Course;
import lombok.Data;

@Data
public class CourseDTO {
    private int id;
    private String name;
    private String code;

    public CourseDTO courseDTO(Course course) {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setId(course.getId());
        courseDTO.setCode(course.getCode());
        courseDTO.setName(course.getName());
        return courseDTO;
    }

    public Course toEntity() {
        Course course = new Course();
        course.setId(this.id);
        course.setName(this.name);
        course.setCode(this.code);
        return course;
    }
}
