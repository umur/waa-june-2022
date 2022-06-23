package com.example.demo.dto;

import com.example.demo.entity.Course;
import lombok.Data;

@Data
public class CourseDTO {
  private int id;
  private String name;
  private String code;

  public CourseDTO toDto(Course course) {
    CourseDTO courseDTO = new CourseDTO();

    courseDTO.setId(course.getId());
    courseDTO.setName(courseDTO.getName());
    courseDTO.setCode(courseDTO.getCode());
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
