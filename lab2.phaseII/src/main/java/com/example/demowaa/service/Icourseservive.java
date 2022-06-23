package com.example.demowaa.service;

import com.example.demowaa.Dto.CourseDto;
import com.example.demowaa.Entity.Course;

import java.util.List;

public interface Icourseservive {
    List<CourseDto> findAll();
    void create(CourseDto dto);
    String delete(int id);
    boolean update(CourseDto c,int id);
}
