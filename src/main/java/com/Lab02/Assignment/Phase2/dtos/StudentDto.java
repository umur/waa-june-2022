package com.Lab02.Assignment.Phase2.dtos;

import com.Lab02.Assignment.Phase2.entity.Course;
import com.Lab02.Assignment.Phase2.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;

    private String gpa;
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
        student.setId(this.id);
        student.setFirstName(this.firstName);
        student.setLastName(this.lastName);
        student.setEmail(this.email);
        student.setMajor(this.major);
        student.setGpa(this.gpa);
        student.setCoursesTaken(this.coursesTaken);
        return student;
    }
}
