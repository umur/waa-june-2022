package com.lab.phase2.service;

import com.lab.phase2.dto.CourseDto;

import java.util.List;

public interface CourseService {
    List<CourseDto> findAll();

    void create(CourseDto dto);

    void delete(int id);

    CourseDto update(CourseDto courseDto, int id);
}
