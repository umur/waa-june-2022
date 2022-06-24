package edu.miu.cs545.phaseII.utils;

import edu.miu.cs545.phaseII.dto.StudentDto;
import edu.miu.cs545.phaseII.entity.Student;

public class StudentUtils {
    public static StudentDto parseStudentToStudentDto(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setFirstName(student.getFirstName());
        studentDto.setLastName(student.getLastName());
        studentDto.setEmail(student.getEmail());
        studentDto.setMajor(student.getMajor());
        studentDto.setGpa(student.getGpa());
        studentDto.setCoursesTaken(student.getCoursesTaken());
        return studentDto;
    }
    public static Student parseStudentDtoToStudent(StudentDto studentDto){
        Student student =new Student();
        student.setId(studentDto.getId());
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setEmail(studentDto.getEmail());
        student.setMajor(studentDto.getMajor());
        student.setGpa(studentDto.getGpa());
        student.setCoursesTaken(studentDto.getCoursesTaken());
        return student;
    }
}
