package com.Lab02.Assignment.Phase4.service.impl;

import com.Lab02.Assignment.Phase4.dtos.StudentDto;
import com.Lab02.Assignment.Phase4.client.js.entity.Student;
import com.Lab02.Assignment.Phase4.repo.StudentRepo4;
import com.Lab02.Assignment.Phase4.service.StudentService4;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl4 implements StudentService4 {

    @Autowired
    private final ModelMapper modelMapper;
    @Override
    public List<StudentDto> getAllStudents(){
       return StudentRepo4.getListStudents().stream()
                .map(s->modelMapper.map(s, StudentDto.class))
                .toList();
    }

    @Override
    public void saveStudent(StudentDto s){
        StudentRepo4.saveStudent(modelMapper.map(s, Student.class));
    }

    @Override
    public void delete(int id){
        StudentRepo4.deleteStudent(id);
    }

    @Override
    public void update(StudentDto s, int id){

        StudentRepo4.updateStudent(modelMapper.map(s, Student.class),id);
    }


}
