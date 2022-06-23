package com.sudip.lab2.phase1.services;


import com.sudip.lab2.phase1.entity.Course;
import com.sudip.lab2.phase1.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentServicev1 {
    List<Student> findAll();

    void create(Student student);

    void update(Student studentDTO, int id);

    void remove(int id);

    List<Student> getStudentsByMajor(String major);

    List<Course> getCoursesByStudentId(int studentId);

}
