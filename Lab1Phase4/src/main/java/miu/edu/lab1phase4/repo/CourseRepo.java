package miu.edu.lab1phase4.repo;

import miu.edu.lab1phase4.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo {
    private static List<Course> courses = new ArrayList<>();

    public CourseRepo(){
        Course c1 = new Course(1, "WAA", "CS545");
        Course c2 = new Course(2, "ALgo", "CS445");
        courses.add(c1);
        courses.add(c2);
    }

    public static List<Course> findAll(){
        return courses;
    }

    public void create(Course c){
        courses.add(c);
    }

    public void delete(int id){
        courses.remove(id);
    }

    public void update(int id, Course c){
        courses.set(id, c);
    }
}
