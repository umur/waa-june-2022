package edu.miu.lab2.phase2.service.studentservice;

import edu.miu.lab2.phase2.dto.StudentDto;
import edu.miu.lab2.phase2.entity.Student;

import java.util.List;

public interface StudentService {

    public List<StudentDto> getStudent();

    public void deleteStudent(int id);
    public void createStudent(StudentDto student);

    public void updateStudent(StudentDto s, int id);

}
