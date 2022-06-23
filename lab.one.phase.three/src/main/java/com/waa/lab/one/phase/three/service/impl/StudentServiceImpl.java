package com.waa.lab.one.phase.three.service.impl;

import com.waa.lab.one.phase.three.dto.CourseDTO;
import com.waa.lab.one.phase.three.dto.StudentDTO;
import com.waa.lab.one.phase.three.mapper.CourseMapper;
import com.waa.lab.one.phase.three.mapper.StudentMapper;
import com.waa.lab.one.phase.three.repo.StudentRepository;
import com.waa.lab.one.phase.three.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    private final CourseMapper courseMapper;

    @Override
    public Long create(StudentDTO studentDTO) {
        return studentRepository.save(studentMapper.toStudent(studentDTO));
    }

    @Override
    public List<StudentDTO> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major).stream().map(studentMapper::toDTO).toList();
    }

    @Override
    public List<CourseDTO> getCoursesByStudentId(Long id) {
        return studentRepository.findCoursesByStudentId(id).stream().map(courseMapper::toDTO).toList();
    }
}
