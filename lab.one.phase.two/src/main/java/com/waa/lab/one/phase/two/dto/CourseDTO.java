package com.waa.lab.one.phase.two.dto;

import com.waa.lab.one.phase.two.entiry.Course;
import lombok.Data;

@Data
public class CourseDTO {

    private Long id;

    private String name;

    private String code;

    public static CourseDTO toDTO(Course course) {
        CourseDTO dto = new CourseDTO();
        dto.setId(course.getId());
        dto.setName(course.getName());
        dto.setCode(course.getCode());
        return dto;
    }

    public static Course toCourse(CourseDTO dto) {
        Course course = new Course();
        course.setId(dto.getId());
        course.setName(dto.getName());
        course.setCode(dto.getCode());
        return course;
    }

}
