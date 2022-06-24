package rest.cs545_waa_lab2_front.repository;

import org.springframework.stereotype.Repository;
import rest.cs545_waa_lab2_front.entity.Course;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo {

    private static List<Course> courses= new ArrayList<>();

    public CourseRepo(){
        Course c1= new Course(1,"WAA","CS545");
        Course c2= new Course(2,"WAP","CS445");
        Course c3= new Course(3,"ASD","CS525");
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
    }
    public List<Course> findAllCourses(){
        return  courses;
    }
public void save(Course c){
    courses.add(c);
}
}