package edu.miu.rest.dto;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import lombok.Data;

import java.util.List;

@Data
public class StudentDto {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private Double gpa;
    private List<Course> coursesTaken;


    public StudentDto toDto(Student student){
        StudentDto dto = new StudentDto();
        dto.setId(student.getId());
        dto.setFirstName(student.getFirstName());
        dto.setLastName(student.getLastName());
        dto.setEmail(student.getEmail());
        dto.setMajor(student.getMajor());
        dto.setGpa(student.getGpa());
        dto.setCoursesTaken(student.getCoursesTaken());
        return dto;
    }

    public Student toEntity(){
        Student student = new Student();
        student.setId(getId());
        student.setFirstName(getFirstName());
        student.setLastName(getLastName());
        student.setEmail(getEmail());
        student.setMajor(getMajor());
        student.setGpa(getGpa());
        student.setCoursesTaken(getCoursesTaken());
        return student;
    }

}
