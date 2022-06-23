package com.waa.phaseIII.service;

import com.waa.phaseIII.dto.CourseDto;
import com.waa.phaseIII.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentDtoMapperService {
    List<StudentDto> findAll();
    List<StudentDto> getByMajor(String major);
    public List<CourseDto> getCoursesByStudentId(int studentId);
    public void save(StudentDto stu);
    public void update(StudentDto stu);
    public void delete(int id);

}
