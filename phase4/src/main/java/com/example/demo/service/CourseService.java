package com.example.demo.service;



import com.example.demo.dto.CourseDto;
import com.example.demo.entity.Course;

import java.util.List;

public interface CourseService {
  List<CourseDto> findAll() ;

  public void create( CourseDto dto);

  public void delete(int id);

  public void update(int id,CourseDto dto);
}
