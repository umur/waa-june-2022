package rest.service;

import rest.entity.Student;
import rest.entity.course;

import java.util.List;

public interface courseService {
    void delete(int id);
    void save(course s);
    List<course> getAll();
    course getById(int id);
}
