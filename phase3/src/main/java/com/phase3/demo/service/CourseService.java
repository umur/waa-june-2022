package com.phase3.demo.service;



import com.phase3.demo.dto.CourseDto;
import com.phase3.demo.entity.Course;

import java.util.List;

public interface CourseService {
  List<CourseDto> findAll() ;

  public void create( CourseDto dto);

  public void delete(int id);

  public void update(int id,CourseDto dto);
}
