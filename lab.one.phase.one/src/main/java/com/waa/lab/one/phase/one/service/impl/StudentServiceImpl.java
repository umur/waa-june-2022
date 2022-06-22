package com.waa.lab.one.phase.one.service.impl;

import com.waa.lab.one.phase.one.entiry.Course;
import com.waa.lab.one.phase.one.entiry.Student;
import com.waa.lab.one.phase.one.repo.StudentRepository;
import com.waa.lab.one.phase.one.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    @Override
    public Long create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major);
    }

    @Override
    public List<Course> getCoursesByStudentId(Long id) {
        return studentRepository.findCoursesByStudentId(id);
    }
}
