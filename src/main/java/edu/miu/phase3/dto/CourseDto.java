package edu.miu.phase3.dto;

import edu.miu.phase3.entity.Course;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class CourseDto {

    private int id;
    private String name;
    private String code;
}
