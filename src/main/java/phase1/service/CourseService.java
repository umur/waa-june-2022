package phase1.service;

import phase1.entity.Course;

import java.util.List;

public interface CourseService {

    public Course findById(Integer id);

    public List<Course> findAll();

    public Integer create(Course course);

    public void update(Integer id, Course course);

    void delete(Integer id);
}
