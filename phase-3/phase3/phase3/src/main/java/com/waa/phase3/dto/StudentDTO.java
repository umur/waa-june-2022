package com.waa.phase3.dto;

import com.waa.phase3.entity.Student;
import com.waa.phase3.entity.Course;
import lombok.Data;

@Data
public class StudentDTO {

    private Integer id;

    private String firstname;

    private String lastname;

    private String email;

    private String major;

    private Double gpa;

//    public static StudentDTO toDTO(Student student) {
//        StudentDTO dto = new StudentDTO();
//        dto.setId(student.getId());
//        dto.setFirstname(student.getFirstName());
//        dto.setLastname(student.getLastName());
//        dto.setEmail(student.getEmail());
//        dto.setMajor(student.getMajor());
//        dto.setGpa(student.getGpa());
//        return dto;
//    }
//
//    public static Student toStudent(StudentDTO dto) {
//        Student student = new Student();
//        student.setId(dto.getId());
//        student.setFirstName(dto.getFirstname());
//        student.setLastName(dto.getLastname());
//        student.setEmail(dto.getEmail());
//        student.setMajor(dto.getMajor());
//        student.setGpa(dto.getGpa());
//        return student;
//    }
}
