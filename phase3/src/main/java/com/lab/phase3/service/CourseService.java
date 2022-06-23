package com.lab.phase3.service;

import com.lab.phase3.dto.CourseDto;

import java.util.List;

public interface CourseService {

    List<CourseDto> findAll();

    void create(CourseDto dto);

    void delete(int id);

    CourseDto update(CourseDto courseDto, int id);
}
