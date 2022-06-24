package miu.edu.lab1phase4.service;

import miu.edu.lab1phase4.entity.Course;
import miu.edu.lab1phase4.entity.Student;
import miu.edu.lab1phase4.dto.StudentDto;

import java.util.List;

public interface StudentService {
    public List<StudentDto> findAll();

    public void create(StudentDto student);

    public void delete(int id);

    public void update(int id, StudentDto s);

    public List<Student> getStudentsByMajor(String major);

    public List<Course> getCoursesByStudentId(int id);
}
