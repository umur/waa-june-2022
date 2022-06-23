package com.sudip.lab2.phase4.services;

import com.sudip.lab2.phase4.dto.CourseDTOv4;
import com.sudip.lab2.phase4.dto.StudentDTOv4;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentServicev4 {
    List<StudentDTOv4> findAll();

    void create(StudentDTOv4 student);

    void update(StudentDTOv4 studentDTO, int id);

    void remove(int id);

    List<StudentDTOv4> getStudentsByMajor(String major);

    List<CourseDTOv4> getCoursesByStudentId(int studentId);

}
