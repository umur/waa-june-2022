package com.sudip.lab2.phase1.services;


import com.sudip.lab2.phase1.entity.Course;
import com.sudip.lab2.phase1.entity.Student;
import com.sudip.lab2.phase1.repository.StudentRepositoryv1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplv1 implements StudentServicev1 {

    StudentRepositoryv1 studentRepository;

    @Autowired
    public StudentServiceImplv1(StudentRepositoryv1 studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void create(Student student) {
        studentRepository.create(student);
    }

    @Override
    public void update(Student student, int id) {
        studentRepository.update(student, id);
    }

    @Override
    public void remove(int id) {
        studentRepository.remove(id);
    }

    @Override
    public List<Student> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major);
    }

    @Override
    public List<Course> getCoursesByStudentId(int studentId) {
        return studentRepository.getCoursesByStudentId(studentId);
    }
}
