package miu.edu.lab1phase3.service;

import miu.edu.lab1phase3.dto.CourseDto;

import java.util.List;

public interface CourseService {
    public List<CourseDto> findAll();
    public void create(CourseDto course);

    public void delete(int id);

    public void update(int id, CourseDto c);

}
