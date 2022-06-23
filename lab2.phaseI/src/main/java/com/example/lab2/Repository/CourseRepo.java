package com.example.lab2.Repository;

import com.example.lab2.Entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class CourseRepo {
    private static List<Course> courses = new ArrayList<>();

    public CourseRepo() {
        Course c1 = new Course(1, "WAA", "545");
        Course c2 = new Course(2, "EA", "544");
        courses.add(c1);
        courses.add(c2);
    }

    public List<Course> findAll() {
        return courses;
    }

    public Course findById(int id) {
        Course course = null;
        for (Course c : courses) {
            if (!Objects.equals(id, c.getId())) throw new IllegalArgumentException();
            else if (c.getId() == id) {
                course = c;
            }
        }
        return course;
    }

    public void add(Course c) {
        courses.add(c);
    }

    public String deleteAll() {
        courses.clear();
        return "all deleted";
    }

    public String deleteById(int id) {
        for (Course s : courses) {
            if (!Objects.equals(id, s.getId())) throw new IllegalArgumentException("not found with this id");
            courses.remove(s);
        }
        return "deleted";
    }
    public boolean update(int id,Course c){
        boolean result=false;
        for(Course course:courses){
            if(!Objects.equals(id,course.getId())) throw new IllegalArgumentException();
            else if(course.getId()==id){
                courses.add(c);
                result=true;
            }
        }
        return result;
    }
}