package edu.miu.rest.service.impl;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import edu.miu.rest.repo.StudentRepo;
import edu.miu.rest.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public List<Student> findAll() {
        var students = studentRepo.findAll();
        return students;
    }

    @Override
    public List<Student> getStudentsByMajor(String major) {
        List<Student> studentList = findAll();
        List<Student> rsList = new ArrayList<>();
        if(studentList != null && studentList.size()>0){
            for(Student student: studentList){
                if(student.getMajor().equals(major)){
                    rsList.add(student);
                }
            }
        }
        return rsList;
    }

    @Override
    public List<Course> getCoursesByStudentId(int studentId) {
        List<Student> studentList = findAll();
        List<Course> rsList = new ArrayList<>();
        if(studentList != null && studentList.size()>0){
            for(Student student: studentList){
                if(student.getId()==studentId){
                    rsList = student.getCourses();
                }
            }
        }
        return rsList;
    }

    @Override
    public void create(Student entity) {
        studentRepo.create(entity);
    }

    @Override
    public void delete(int id) {
        List<Student> studentList = findAll();
        for(Student entity:studentList){
            if(id == entity.getId()){
                studentRepo.delete(entity);
                break;
            }
        }
    }

    @Override
    public void update(Student entity,int id) {
        List<Student> studentList = findAll();
        for(Student student:studentList){
            if(id == student.getId()){
                student = entity;
            }
        }
        studentRepo.update(studentList);
    }
}
