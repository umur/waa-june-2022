package miu.edu.phase3.service;

import miu.edu.phase2.dto.CourseDto;

import java.util.List;

public interface CourseService {
    List<CourseDto> findAll();
    CourseDto findOne(int id);
    CourseDto create(CourseDto course);
    CourseDto update(CourseDto course, int id);
    void delete(int id);
}
