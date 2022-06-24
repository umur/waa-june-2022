package com.example.lab2.phase1.service;

import com.example.lab2.phase1.entity.Student;
import com.example.lab2.phase1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudentsByMajor(String major) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
