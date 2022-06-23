package com.waa.lab.one.phase.two.dto;

import com.waa.lab.one.phase.two.entiry.Course;
import com.waa.lab.one.phase.two.entiry.Student;
import lombok.Data;

@Data
public class StudentDTO {

    private Long id;

    private String firstname;

    private String lastname;

    private String email;

    private String major;

    private String gpa;

    public static StudentDTO toDTO(Student student) {
        StudentDTO dto = new StudentDTO();
        dto.setId(student.getId());
        dto.setFirstname(student.getFirstname());
        dto.setLastname(student.getLastname());
        dto.setEmail(student.getEmail());
        dto.setMajor(student.getMajor());
        dto.setGpa(student.getGpa());
        return dto;
    }

    public static Student toStudent(StudentDTO dto) {
        Student student = new Student();
        student.setId(dto.getId());
        student.setFirstname(dto.getFirstname());
        student.setLastname(dto.getLastname());
        student.setEmail(dto.getEmail());
        student.setMajor(dto.getMajor());
        student.setGpa(dto.getGpa());
        return student;
    }

}
