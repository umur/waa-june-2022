package edu.miu.phase2.services;

import edu.miu.phase2.dto.CourseDto;
import edu.miu.phase2.dto.StudentDTO;

import java.util.List;

public interface StudentServices2 {

    List<StudentDTO> getStudents();

    void addStudent(StudentDTO student);

    void updateStudent(StudentDTO student, int id);

    void deleteStudent(int id);

    StudentDTO getStudentsByMajor(String major);

    List<CourseDto> getCoursesByStudentId(int sid);
}
