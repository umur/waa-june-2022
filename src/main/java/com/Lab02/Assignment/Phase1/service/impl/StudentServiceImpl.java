package com.Lab02.Assignment.Phase1.service.impl;

import com.Lab02.Assignment.Phase1.repo.StudentRepo;
import com.Lab02.Assignment.Phase1.entity.Student;
import com.Lab02.Assignment.Phase1.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> getAllStudents(){
        return StudentRepo.getListStudents();
    }

    @Override
    public void saveStudent(Student s){
        StudentRepo.saveStudent(s);
    }

    @Override
    public void delete(int id){
        StudentRepo.deleteStudent(id);
    }

    @Override
    public void update(Student s, int id){
        StudentRepo.updateStudent(s,id);
    }


}
