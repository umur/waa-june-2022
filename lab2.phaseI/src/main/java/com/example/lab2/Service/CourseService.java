package com.example.lab2.Service;

import com.example.lab2.Entity.Course;
import com.example.lab2.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    public List<Course> findAll(){
        return courseRepo.findAll();

    }
    public Course findById( int id){
        return courseRepo.findById(id);
    }

    public void add( Course c){
        courseRepo.add(c);
    }

    public String deleteAll(){
        return courseRepo.deleteAll();

    }
    public String deleteById(int id){
        return courseRepo.deleteById(id);
    }
    public Boolean update(int id,Course c){
        return courseRepo.update(id,c);
    }

}
