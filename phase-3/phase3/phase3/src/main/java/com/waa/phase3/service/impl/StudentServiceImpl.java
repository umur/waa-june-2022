package com.waa.phase3.service.impl;

import com.waa.phase3.dto.CourseDTO;
import com.waa.phase3.dto.StudentDTO;
import com.waa.phase3.entity.Course;
import com.waa.phase3.entity.Student;
import com.waa.phase3.mapper.CourseMapper;
import com.waa.phase3.mapper.StudentMapper;
import com.waa.phase3.repository.StudentRepository;
import com.waa.phase3.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    private final CourseMapper courseMapper;

    @Override
    public Integer create(StudentDTO studentDTO) {
        return studentRepository.save(studentMapper.toStudent(studentDTO));
    }

    @Override
    public List<StudentDTO> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major).stream().map(studentMapper::toDTO).toList();
    }

    @Override
    public List<CourseDTO> getCoursesByStudentId(Integer id) {
        return studentRepository.findCoursesByStudentId(id).stream().map(courseMapper::toDTO).toList();
    }
}

