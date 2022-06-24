package com.example.demo.service;

import com.example.demo.entity.Course;


import java.util.List;

public interface CourseService {
  public  List<Course> findAll() ;

  public void create( Course dto);

  public void delete(int id);

  public void update(int id,Course dto);
}
