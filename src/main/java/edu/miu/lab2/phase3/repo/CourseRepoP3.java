package edu.miu.lab2.phase3.repo;

import edu.miu.lab2.phase3.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepoP3 {
    List<Course> courses=new ArrayList<>();



    public CourseRepoP3(){
        Course c1=new Course(1,"WAP","CS417");
        Course c2=new Course(2,"WAA","CS545");
        courses.add(c1);
        courses.add(c2);
    }

    public List<Course> findCourse(){
        return courses;
    }
    public void createCourse(Course c){
        courses.add(c);
    }

    public void deleteCourse(int id){
        courses.removeIf(course -> course.getId() == id);
    }

    public void updateCourse(Course course, int id){
        courses.set(id,course);
    }



}
