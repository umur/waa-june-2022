package miu.edu.lab1.service;

import miu.edu.lab1.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> findAll();
    public void create(Course course);

    public void delete(int id);

    public void update(int id, Course c);

}
