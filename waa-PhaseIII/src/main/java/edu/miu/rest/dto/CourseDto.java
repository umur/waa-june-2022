package edu.miu.rest.dto;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class CourseDto {

    private int id;
    private String name;
    private String code;

    public CourseDto toDto(Course course){
        ModelMapper modelMapper = new ModelMapper();
        CourseDto dto = new CourseDto();
        dto = modelMapper.map(course,CourseDto.class);
        return dto;
    }

    public Course toEntity(){
        ModelMapper modelMapper = new ModelMapper();
        Course course = new Course();
        course = modelMapper.map(this,Course.class);
        return course;
    }

}
