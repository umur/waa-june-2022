package edu.miu.cs545.course.repository;

import edu.miu.cs545.course.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {
    private static List<Course> courses = new ArrayList<>();
    public CourseRepository(){
        Course c1 = new Course(1,"Fundamentals of Fundamentals", "FN101");
        Course c2 = new Course(2,"Advanced Fundamentals", "FN102");
        Course c3 = new Course(3,"Fundamentals 3: Revenge of the Fundamentals", "FN666");
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
    }

    public List<Course> findAll(){
        return courses;
    }

    public void create(Course c){
        courses.add(c);
    }

    public void delete(int id) { courses.remove(id);}

    public void update(int id, Course course) {

    }
}
