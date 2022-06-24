package miu.edu.restdto.lab1phase2.service;

import miu.edu.restdto.lab1phase2.dto.CourseDto;
import miu.edu.restdto.lab1phase2.entity.Course;

import java.util.List;

public interface CourseService {
    public List<CourseDto> findAll();
    public void create(CourseDto course);

    public void delete(int id);

    public void update(int id, CourseDto c);

}
