package com.waa.phaseII.service;

import com.waa.phaseII.dto.CourseDto;
import com.waa.phaseII.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentDtoService {
    List<StudentDto> findAll();
    List<StudentDto> getByMajor(String major);
    public List<CourseDto> getCoursesByStudentId(int studentId);
    public void save(StudentDto stu);
    public void update(StudentDto stu);
    public void delete(int id);

}
