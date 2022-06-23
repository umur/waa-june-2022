package com.waa.lab.one.phase.three.service;

import com.waa.lab.one.phase.three.dto.CourseDTO;
import com.waa.lab.one.phase.three.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    Long create(StudentDTO course);

    List<StudentDTO> getStudentsByMajor(String major);

    List<CourseDTO> getCoursesByStudentId(Long id);

}
