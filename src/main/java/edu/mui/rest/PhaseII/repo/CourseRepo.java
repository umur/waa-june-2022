package edu.mui.rest.PhaseII.repo;

import edu.mui.rest.PhaseII.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo {
    private static List<Course> courses = new ArrayList<>();

    public CourseRepo(){
        Course course1 = new Course(1,"WAA","576");
        Course course2 = new Course(2,"WAP","576");
        Course course3 = new Course(3,"EA","576");
        Course course4 = new Course(4,"ALG","576");

        courses.addAll(List.of(course1,course2,course3,course4));
    }

    public List<Course> findAll() {
        return courses;
    }

    public Course findById(int id) {
        return courses.get(id+1);
    }
}
