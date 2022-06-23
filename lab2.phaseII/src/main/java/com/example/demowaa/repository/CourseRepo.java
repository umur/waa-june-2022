package com.example.demowaa.repository;

import com.example.demowaa.Entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class CourseRepo   {
    private static List<Course> courses = new ArrayList<>();


    public CourseRepo(){
        Course c1 = new Course(1,"WAA", "CS545");
        Course c2 = new Course(2,"WAP","CS472");
        courses.add(c1);
        courses.add(c2);

    }


    public List<Course> findAll(){

        return  courses;
    }

    public void create(Course c){

        courses.add(c);
    }
    public void delete(int id){
        Course c=new Course();
        if (!Objects.equals(id,c.getId())){
            throw new IllegalArgumentException("NOT FOUND WITH THIS ID");
        }

        courses.remove(c);
    }
    public boolean update(Course c,int id){

        courses.add(c);
        return false;
    }

}
