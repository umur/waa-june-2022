package com.example.demo.service;

import com.example.demo.dto.CourseDTO;

import java.util.List;

public interface CourseService {
  public List<CourseDTO> findAll();

  public void create(CourseDTO course);

  public void delete(int id);

  public void update(int id,CourseDTO dto);
}
