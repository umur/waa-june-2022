package miu.edu.restdto.lab1phase2.service;

import miu.edu.restdto.lab1phase2.dto.StudentDto;
import miu.edu.restdto.lab1phase2.entity.Course;
import miu.edu.restdto.lab1phase2.entity.Student;

import java.util.List;

public interface StudentService {
    public List<StudentDto> findAll();

    public void create(StudentDto student);

    public void delete(int id);

    public void update(int id, StudentDto s);

    public List<Student> getStudentsByMajor(String major);

    public List<Course> getCoursesByStudentId(int id);
}
