package com.Lab02.Assignment.Phase2.service.impl;

import com.Lab02.Assignment.Phase2.dtos.StudentDto;
import com.Lab02.Assignment.Phase2.entity.Student;
import com.Lab02.Assignment.Phase2.repo.StudentRepo2;
import com.Lab02.Assignment.Phase2.service.StudentService2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl2 implements StudentService2 {

    @Override
    public List<StudentDto> getAllStudents(){
        List<Student> listStudent = StudentRepo2.getListStudents();
        StudentDto studentDto = new StudentDto();
        List<StudentDto> listStudentDto= new ArrayList<StudentDto>();
        for (int i=0; i<listStudent.size();i++){

            listStudentDto.add(studentDto.toDto(listStudent.get(i)));
        }
        return listStudentDto;
    }

    @Override
    public void saveStudent(StudentDto s){
        StudentRepo2.saveStudent(s.toEntity());
    }

    @Override
    public void delete(int id){
        StudentRepo2.deleteStudent(id);
    }

    @Override
    public void update(StudentDto s, int id){

        StudentRepo2.updateStudent(s.toEntity(),id);
    }


}
