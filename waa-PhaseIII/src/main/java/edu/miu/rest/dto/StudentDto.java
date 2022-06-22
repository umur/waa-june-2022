package edu.miu.rest.dto;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import lombok.Data;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@Data
public class StudentDto {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private String coursesTaken;
    private int gpa;
    private static List<Course> courses = new ArrayList<>();

    public StudentDto toDto(Student student){
        ModelMapper modelMapper = new ModelMapper();
        StudentDto dto = new StudentDto();
        dto = modelMapper.map(student,StudentDto.class);
        dto.setCourses(student.getCourses());

        return dto;
    }

    public Student toEntity(){
        ModelMapper modelMapper = new ModelMapper();
        Student student = new Student();
        student = modelMapper.map(this,Student.class);
        student.setCourses(this.courses);
        return student;
    }

    public static List<Course> getCourses() {
        return courses;
    }

    public static void setCourses(List<Course> courses) {
        StudentDto.courses = courses;
    }

}
