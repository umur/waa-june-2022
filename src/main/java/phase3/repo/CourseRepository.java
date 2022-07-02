package phase3.repo;

import org.springframework.stereotype.Repository;
import phase3.entity.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

@Repository
public class CourseRepository {

    private List<Course> courses = new ArrayList<>();

    public CourseRepository() {
        courses.add(new Course(1, "WAA", "CS555"));
        courses.add(new Course(1, "FPP", "CS425"));
        courses.add(new Course(3, "WAP", "CS475"));
        courses.add(new Course(3, "ASD", "CS525"));
        courses.add(new Course(4, "WAA", "CS545"));
        courses.add(new Course(2, "MPP", "CS450"));
    }

    public Course findById(Integer id) {
        return courses.stream()
                .filter(it -> Objects.equals(it.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public Integer save(Course course) {
        Integer id = new Random().nextInt(1000);
        course.setId(id);
        courses.add(course);
        return id;
    }

    public void update(Integer id, Course course) {
        Course db = courses.stream()
                .filter(it -> it.getId() == id)
                .findFirst()
                .orElse(null);

        db.setCode(course.getCode());
        db.setName(course.getName());
    }

    public void delete(int id) {
        courses.removeIf(it -> it.getId() == id);
    }

    public List<Course> findAll() {
        return courses;
    }
}
