package com.waa.phaseIII.dto;

import com.waa.phaseIII.entity.Course;
import com.waa.phaseIII.entity.Student;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
public class StudentDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<Course> courseList;
    private double gpa;


//    public StudentDto entityToDto(Student student) {
//        StudentDto dto = new StudentDto();
//        dto.setId(student.getId());
//        dto.setEmail(student.getEmail());
//        dto.setCourseList(student.getCourseList());
//        dto.setFirstName(student.getFirstName());
//        dto.setLastName(student.getLastName());
//        return dto;
//    }
//
//    public Student dtoToEntity() {
//        Student student = new Student();
//        student.setId(this.getId());
//        student.setEmail(this.getEmail());
//        student.setCourseList(this.getCourseList());
//        student.setFirstName(this.getFirstName());
//        student.setLastName(this.getLastName());
//        return student;
//    }
}
