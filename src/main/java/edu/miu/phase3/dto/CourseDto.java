package edu.miu.phase3.dto;

import edu.miu.phase3.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class CourseDto {
    int id;
    String name;
    String code;

//    CourseDto toCourseDto(Course course) {
//        CourseDto courseDto = new CourseDto();
//        courseDto.setId(course.getId());
//        courseDto.setName(course.getName());
//        courseDto.setCode(course.getCode());
//
//        return courseDto;
//    }
//
//    Course toCourse() {
//        return new Course(this.id, this.name, this.code);
//    }
}
