package edu.miu.rest.repository;

import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo {
    private static List<Course> courses = new ArrayList<>();

    public CourseRepo() {
        Course c1 = new Course(1, "WAA", "CS545");
        Course c2 = new Course(2, "WAP", "CS472");
        courses.add(c1);
        courses.add(c2);
    }

    public List<Course> findAll() {
        return courses;
    }

    public void create(Course c) {
        courses.add(c);
    }

    public void update(Course c) {
        for(Course course : courses)
        {
            if(course.getId()== c.getId())
            {
                int x = courses.indexOf(course);
                courses.set(x , c) ;
            }
        }

    }

    public void delete(Course c) {
        courses.remove(c);
    }

}
