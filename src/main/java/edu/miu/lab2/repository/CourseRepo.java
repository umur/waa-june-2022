package edu.miu.lab2.repository;

import edu.miu.lab2.entity.Course;
import edu.miu.lab2.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo {

    List<Course> courses = new ArrayList<>();

    public CourseRepo() {
        Course c1 = new Course(1, "WAA", "CS545");
        Course c2 = new Course(2, "WAP", "CS472");
        Course c3 = new Course(3, "EA", "CS500");

        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public ResponseEntity<Course> updateCourse(Course course, int id) {
        Course updatedCourse = courses.stream().filter(c -> c.getId() == id).findFirst().get();
        int indexToUpdate = courses.indexOf(updatedCourse);

        courses.set(indexToUpdate, course);

        return new ResponseEntity<>(updatedCourse, HttpStatus.OK);
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void deleteCourse(int id) {
        this.courses.removeIf(c -> c.getId() == id);
    }


}
