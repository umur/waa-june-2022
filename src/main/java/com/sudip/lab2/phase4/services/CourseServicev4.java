package com.sudip.lab2.phase4.services;

import com.sudip.lab2.phase4.dto.CourseDTOv4;

import java.util.List;

public interface CourseServicev4 {
    void create(CourseDTOv4 courseDTO);

    List<CourseDTOv4> findAll();

    void update(CourseDTOv4 courseDTO, int id);

    void remove(int id);

}
