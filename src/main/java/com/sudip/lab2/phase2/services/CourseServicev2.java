package com.sudip.lab2.phase2.services;

import com.sudip.lab2.phase2.dto.CourseDTO;

import java.util.List;

public interface CourseServicev2 {
    void create(CourseDTO courseDTO);

    List<CourseDTO> findAll();

    void update(CourseDTO courseDTO, int id);

    void remove(int id);

}
