package com.waa.assignment.service.impl;

import com.waa.assignment.entity.Course;
import com.waa.assignment.entity.Student;
import com.waa.assignment.repo.StudentRepo;
import com.waa.assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepo studentRepo;

    @Autowired
    private StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public List<Student> getByMajor(String major) {
        return studentRepo.getByMajor(major);
    }

    @Override
    public List<Course> getCoursesByStudentId(int studentId) {
        return studentRepo.getCoursesByStudentId(studentId);
    }

    @Override
    public void save(Student stu) {
        studentRepo.save(stu);
    }

    @Override
    public void update(Student stu) {
        studentRepo.update(stu);
    }

    @Override
    public void delete(int id) {
        studentRepo.delete(id);
    }
}
