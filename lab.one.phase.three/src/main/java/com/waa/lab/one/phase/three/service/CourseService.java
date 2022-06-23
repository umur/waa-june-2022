package com.waa.lab.one.phase.three.service;

import com.waa.lab.one.phase.three.dto.CourseDTO;

import java.util.List;

public interface CourseService {

    CourseDTO findById(Long id);

    List<CourseDTO> findAll();

    Long create(CourseDTO course);

    void update(Long id, CourseDTO course);

    void delete(Long id);
}
