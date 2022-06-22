package com.example.demo.service;

import com.example.demo.dto.CourseDTO;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;

import java.util.List;

public interface CourseService {
  public List<CourseDTO> findAll();

  public void create(CourseDTO course);

  public void delete(int id);

  public void update(int id,CourseDTO dto);
}
