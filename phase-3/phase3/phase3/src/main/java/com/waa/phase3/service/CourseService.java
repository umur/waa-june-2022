package com.waa.phase3.service;

import com.waa.phase3.dto.CourseDTO;
import com.waa.phase3.entity.Course;

import java.util.List;

public interface CourseService {

    CourseDTO findById(Integer id);

    List<CourseDTO> findAll();

    Integer create(CourseDTO course);

    void update(Integer id, CourseDTO course);

    void delete(Integer id);
}
