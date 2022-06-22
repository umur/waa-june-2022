package com.phase2.dto;

import com.phase2.domain.Course;
import com.phase2.domain.Student;
import lombok.Data;

import java.util.List;

@Data
public class StudentDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> coursesTaken;
    private double gpa;

    public StudentDto toDto(Student student){
        StudentDto dto = new StudentDto();
        dto.setId(student.getId());
        dto.setFirstName(student.getFirstName());
        dto.setLastName(student.getLastName());
        dto.setEmail(student.getEmail());
        dto.setCoursesTaken(student.getCoursesTaken());
        dto.setMajor(student.getMajor());
        dto.setGpa(student.getGpa());
        return dto;
    }

    public Student toEntity(){
        Student student = new Student();
        student.setId(this.id);
        student.setId(this.getId());
        student.setFirstName(this.getFirstName());
        student.setLastName(this.getLastName());
        student.setEmail(this.getEmail());
        student.setCoursesTaken(this.getCoursesTaken());
        student.setMajor(this.getMajor());
        student.setGpa(this.getGpa());
        return student;
    }
}
