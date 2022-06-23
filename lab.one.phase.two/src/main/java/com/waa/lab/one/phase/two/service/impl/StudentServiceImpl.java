package com.waa.lab.one.phase.two.service.impl;

import com.waa.lab.one.phase.two.dto.CourseDTO;
import com.waa.lab.one.phase.two.dto.StudentDTO;
import com.waa.lab.one.phase.two.repo.StudentRepository;
import com.waa.lab.one.phase.two.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    @Override
    public Long create(StudentDTO studentDTO) {
        return studentRepository.save(StudentDTO.toStudent(studentDTO));
    }

    @Override
    public List<StudentDTO> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major).stream().map(StudentDTO::toDTO).toList();
    }

    @Override
    public List<CourseDTO> getCoursesByStudentId(Long id) {
        return studentRepository.findCoursesByStudentId(id).stream().map(CourseDTO::toDTO).toList();
    }
}
