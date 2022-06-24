package com.waa.phase1.service.impl;

import com.waa.phase1.entity.Course;
import com.waa.phase1.entity.Student;
import com.waa.phase1.repository.StudentRepository;
import com.waa.phase1.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Integer create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major);
    }

    @Override
    public List<Course> getCoursesByStudentId(Integer id) {
        return studentRepository.findCoursesByStudentId(id);
    }
}

