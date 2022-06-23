package com.waa.lab.one.phase.one.service;

import com.waa.lab.one.phase.one.entiry.Course;
import com.waa.lab.one.phase.one.entiry.Student;

import java.util.List;

public interface StudentService {

    Long create(Student course);

    List<Student> getStudentsByMajor(String major);

    List<Course> getCoursesByStudentId(Long id);

}
