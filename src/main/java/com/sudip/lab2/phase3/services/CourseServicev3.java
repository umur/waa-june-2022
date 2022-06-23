package com.sudip.lab2.phase3.services;

import com.sudip.lab2.phase3.dto.CourseDTO;

import java.util.List;

public interface CourseServicev3 {
    void create(CourseDTO courseDTO);

    List<CourseDTO> findAll();

    void update(CourseDTO courseDTO, int id);

    void remove(int id);

}
