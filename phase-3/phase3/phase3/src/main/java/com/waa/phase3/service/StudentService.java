package com.waa.phase3.service;

import com.waa.phase3.dto.CourseDTO;
import com.waa.phase3.dto.StudentDTO;


import java.util.List;

public interface StudentService {

    Integer create(StudentDTO course);

    List<StudentDTO> getStudentsByMajor(String major);

    List<CourseDTO> getCoursesByStudentId(Integer id);

}
