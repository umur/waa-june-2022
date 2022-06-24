package com.example.rest.phaseII.dto;

import com.example.rest.phaseII.entity.Student;
import lombok.Data;

@Data
public class StudentDto {
    private int id;
    private String firstName;
    private String lastName;

    public StudentDto toDto(Student student){
        StudentDto dto = new StudentDto();
        dto.setId(student.getId());
        dto.setFirstName(student.getFirstName());
        dto.setLastName(student.getLastName());
        return dto;
    }

    public Student toEntity(){
        Student student = new Student();
        student.setId(this.id);
        student.setFirstName(this.firstName);
        student.setLastName(this.lastName);
        return student;
    }

}
