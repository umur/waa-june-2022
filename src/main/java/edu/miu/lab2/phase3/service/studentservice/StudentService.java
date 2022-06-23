package edu.miu.lab2.phase3.service.studentservice;

import edu.miu.lab2.phase3.dto.StudentDtoP3;

import java.util.List;

public interface StudentService {

    public List<StudentDtoP3> getStudent();

    public void deleteStudent(int id);
    public void createStudent(StudentDtoP3 student);

    public void updateStudent(StudentDtoP3 s, int id);

}
