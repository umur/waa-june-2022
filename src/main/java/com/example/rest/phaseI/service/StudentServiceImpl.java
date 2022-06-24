package com.example.rest.phaseI.service;

import com.example.rest.phaseI.entity.Course;
import com.example.rest.phaseI.entity.Student;
import com.example.rest.phaseI.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepo studentRepo;
//    @Override
//    public void createStudent() {
//        studentRepo.createStudent();
//    }

    @Override
    public void deleteStudent(Student s) {
        studentRepo.deleteStudent(s);
    }

    @Override
    public Student getStudent(int id) {
        return studentRepo.getStudent(id);
    }

    @Override
    public void update(Student s) {
        studentRepo.update(s);
    }

    public List<Student> getStudentsByMajor(String major) {
        return studentRepo.getStudentsByMajor(major);
    }

    public List<Course> getCoursesByStudentId(int id) {
        return studentRepo.getCoursesByStudentId(id);
    }
}
