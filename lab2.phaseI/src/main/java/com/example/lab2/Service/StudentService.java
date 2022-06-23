package com.example.lab2.Service;

import com.example.lab2.Entity.Course;
import com.example.lab2.Entity.Student;
import com.example.lab2.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public List<Student> findAll(){

       return studentRepo.findAll();

    }
    public Student getById(int id){
        return studentRepo.getById(id);
    }
    public void add(Student s){
        studentRepo.add(s);
    }
    public boolean update(int id, Student s){
       return studentRepo.update(id,s);

    }
    public String deleteById(int id){
        return studentRepo.deleteById(id);
    }
    public String deleteAll(){
        return studentRepo.deleteAll();
    }
    public List<Student> getStudentByMajor(String major){
        return studentRepo.getStudentsByMajor(major);
    }
    public List<Course> getCourseByStudentId(int studentId){
        return studentRepo.getCoursesByStudentId(studentId);
    }
}
