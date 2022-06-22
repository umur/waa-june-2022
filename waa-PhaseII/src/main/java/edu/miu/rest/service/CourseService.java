package edu.miu.rest.service;

import edu.miu.rest.dto.CourseDto;
import edu.miu.rest.dto.StudentDto;

import java.util.List;

public interface CourseService {
    List<CourseDto> findAll();

    void create(CourseDto dto);
    void delete(int id);
    void update(CourseDto dto,int id);

}
