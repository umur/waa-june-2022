package edu.miu.phase3.dto;

import edu.miu.phase3.entity.Course;
import edu.miu.phase3.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class StudentDto {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<CourseDto> coursesTaken;
    private double gpa;

}
