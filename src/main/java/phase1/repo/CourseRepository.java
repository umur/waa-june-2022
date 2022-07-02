package phase1.repo;

import org.springframework.stereotype.Repository;
import phase1.entity.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

@Repository
public class CourseRepository {

    private List<Course> courses = new ArrayList<>();

    public CourseRepository() {
        courses.add(new Course(1, "FPP", "CS425"));
        courses.add(new Course(2, "MPP", "CS450"));
        courses.add(new Course(3, "WAP", "CS475"));
        courses.add(new Course(3, "ASD", "CS525"));
        courses.add(new Course(4, "WAA", "CS545"));
    }
    public Integer save(Course course) {
        int id = new Random().nextInt(10000);
        course.setId(id);
        courses.add(course);
        return id;
    }
    public void update(Integer id, Course course) {
        Course savedCourse = courses.stream()
                .filter(it -> it.getId() == id)
                .findFirst()
                .orElse(null);

        savedCourse.setCode(course.getCode());
        savedCourse.setName(course.getName());
    }

    public void delete(Integer id) {
        courses.removeIf(course -> course.getId() == id);
    }
    public Course findById(Integer id) {
        return courses.stream()
                .filter(course -> Objects.equals(course.getId(), id))
                .findFirst()
                .orElse(null);
    }


    public List<Course> findAll() {
        return courses;
    }
}
