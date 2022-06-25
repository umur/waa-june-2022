package phaseI.miu.cs545.course.service;

import phaseI.miu.cs545.course.entity.CourseDto;
import phaseI.miu.cs545.course.entity.StudentDto;

import java.util.List;

public interface StudentService {
    void createNewStudent(StudentDto student);
    List<StudentDto> getAllStudents();
    void updateStudent(StudentDto student, int id);
    void deleteStudent(int id);
    List<StudentDto> getStudentsByMajor(String major);
    List<CourseDto> getCoursesByStudentId(int id);
}
