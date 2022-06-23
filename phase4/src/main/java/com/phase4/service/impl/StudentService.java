package com.phase4.service.impl;

import com.phase4.Utilities.ModelMapperUti;
import com.phase4.domain.Student;
import com.phase4.dto.CourseDto;
import com.phase4.dto.StudentDto;
import com.phase4.repository.StudentRepo;
import com.phase4.service.ServiceInit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentService implements ServiceInit<StudentDto> {
    private final StudentRepo studentRepo;
    private final ModelMapperUti modelMapperUti;
    public List<StudentDto> getAll() {
        return modelMapperUti.mapList( studentRepo.getAll(),StudentDto.class);
    }

    public void save(StudentDto c) {
        studentRepo.save(modelMapperUti.map(c,Student.class));
    }

    public void delete(Long id) {
        studentRepo.delete((id));
    }

    public void update(Long id, StudentDto c) {
         studentRepo.update(id, modelMapperUti.map(c, Student.class));
    }

    public StudentDto getById(Long id) {
        return modelMapperUti.map( studentRepo.getByPK(id),StudentDto.class);
    }
    public List<StudentDto> getStudentsByMajor(String major) {
        return modelMapperUti.mapList(studentRepo.getStudentsByMajor(major),StudentDto.class);
    }
    public List<CourseDto> getCoursesByStudentId(Long studentId){
        return modelMapperUti.mapList(studentRepo.getCoursesByStudentId(studentId), CourseDto.class);
    }
}

