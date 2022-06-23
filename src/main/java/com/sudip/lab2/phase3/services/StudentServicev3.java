package com.sudip.lab2.phase3.services;

import com.sudip.lab2.phase3.dto.CourseDTO;
import com.sudip.lab2.phase3.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentServicev3 {
    List<StudentDTO> findAll();

    void create(StudentDTO student);

    void update(StudentDTO studentDTO, int id);

    void remove(int id);

    List<StudentDTO> getStudentsByMajor(String major);

    List<CourseDTO> getCoursesByStudentId(int studentId);

}
