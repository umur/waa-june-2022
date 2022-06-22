package edu.mui.rest.PhaseIII.dto;

import edu.mui.rest.PhaseIII.entity.Course;
import edu.mui.rest.PhaseIII.entity.Student;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
@NoArgsConstructor
public class StudentDto {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private double gpa;
    private List<Course> takenCourses;


//    public StudentDto toDto(Student student){
////        StudentDto dto = mapper.map(student, StudentDto.class);
//        StudentDto dto = new StudentDto();
//        dto.setId(student.getId());
//        dto.setFirstName(student.getFirstName());
//        dto.setLastName(student.getLastName());
//        dto.setEmail(student.getEmail());
//        dto.setMajor(student.getMajor());
//        dto.setGpa(student.getGpa());
//        dto.setTakenCourses(student.getTakenCourses());
//        return dto;
//    }

//    public Student toEntity(){
////        Student student = mapper.map(this, Student.class);
//        Student student = new Student();
//        student.setId(getId());
//        student.setFirstName(getFirstName());
//        student.setLastName(getLastName());
//        student.setEmail(getEmail());
//        student.setMajor(getMajor());
//        student.setGpa(getGpa());
//        student.setTakenCourses(getTakenCourses());
//        return student;
//    }

}
