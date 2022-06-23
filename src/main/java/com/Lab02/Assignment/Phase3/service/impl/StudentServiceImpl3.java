package com.Lab02.Assignment.Phase3.service.impl;

import com.Lab02.Assignment.Phase3.dtos.StudentDto;
import com.Lab02.Assignment.Phase3.entity.Course;
import com.Lab02.Assignment.Phase3.entity.Student;
import com.Lab02.Assignment.Phase3.repo.StudentRepo3;
import com.Lab02.Assignment.Phase3.service.StudentService3;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl3 implements StudentService3 {

    @Autowired
    private final ModelMapper modelMapper;
    @Override
    public List<StudentDto> getAllStudents(){
       return StudentRepo3.getListStudents().stream()
                .map(s->modelMapper.map(s,StudentDto.class))
                .toList();
    }

    @Override
    public void saveStudent(StudentDto s){
        StudentRepo3.saveStudent(modelMapper.map(s, Student.class));
    }

    @Override
    public void delete(int id){
        StudentRepo3.deleteStudent(id);
    }

    @Override
    public void update(StudentDto s, int id){

        StudentRepo3.updateStudent(modelMapper.map(s,Student.class),id);
    }


}
