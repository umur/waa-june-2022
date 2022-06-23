package com.waa.phaseII.service.impl;

import com.waa.phaseII.dto.CourseDto;
import com.waa.phaseII.dto.StudentDto;
import com.waa.phaseII.entity.Course;
import com.waa.phaseII.entity.Student;
import com.waa.phaseII.repo.StudentDtoRepo;
import com.waa.phaseII.service.StudentDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentDtoServiceImpl implements StudentDtoService {
    private StudentDtoRepo studentDtoRepo;

    @Autowired
    private StudentDtoServiceImpl(StudentDtoRepo studentDtoRepo) {
        this.studentDtoRepo = studentDtoRepo;
    }

    @Override
    public List<StudentDto> findAll() {
        List<Student> student = studentDtoRepo.findAll();
        List<StudentDto> dtos = new ArrayList<>();
        for (Student stu : student) {
            StudentDto studentDto = new StudentDto();
            dtos.add(studentDto.entityToDto(stu));
        }
        return dtos;
    }

    @Override
    public List<StudentDto> getByMajor(String major) {
        List<Student> student = studentDtoRepo.getByMajor(major);
        List<StudentDto> dtos = new ArrayList<>();
        for (Student stu : student) {
            StudentDto studentDto = new StudentDto();
            dtos.add(studentDto.entityToDto(stu));
        }
        return dtos;
    }

    @Override
    public List<CourseDto> getCoursesByStudentId(int studentId) {
        List<Course> courses = studentDtoRepo.getCoursesByStudentId(studentId);
        List<CourseDto> dtos = new ArrayList<>();
        for(Course course: courses)
        {
            CourseDto courseDto = new CourseDto();
           dtos.add(courseDto.entityToDto(course));
        }
        return dtos;
    }

    @Override
    public void save(StudentDto stu) {
        Student student = stu.dtoToEntity();
        studentDtoRepo.save(student);
    }

    @Override
    public void update(StudentDto stu) {
        Student student = stu.dtoToEntity();
        studentDtoRepo.update(student);
    }

    @Override
    public void delete(int id) {
        studentDtoRepo.delete(id);
    }
}
