package com.waa.phase2.service.impl;

import com.waa.phase2.dto.CourseDTO;
import com.waa.phase2.dto.StudentDTO;
import com.waa.phase2.entity.Course;
import com.waa.phase2.entity.Student;
import com.waa.phase2.repository.StudentRepository;
import com.waa.phase2.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Integer create(StudentDTO studentDTO) {
        return studentRepository.save(StudentDTO.toStudent(studentDTO));
    }

    @Override
    public List<StudentDTO> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major).stream().map(StudentDTO::toDTO).toList();
    }

    @Override
    public List<CourseDTO> getCoursesByStudentId(Integer id) {
        return studentRepository.findCoursesByStudentId(id).stream().map(CourseDTO::toDTO).toList();
    }
}

