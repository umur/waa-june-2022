package com.waa.phase2.service;

import com.waa.phase2.dto.CourseDTO;
import com.waa.phase2.entity.Course;

import java.util.List;

public interface CourseService {

    CourseDTO findById(Integer id);

    List<CourseDTO> findAll();

    Integer create(CourseDTO course);

    void update(Integer id, CourseDTO course);

    void delete(Integer id);
}
