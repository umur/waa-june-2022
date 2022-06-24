package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseImpl implements CourseService {
  @Autowired
  CourseRepo courseRepo;

  @Override
  public List<Course> findAll() {
   return  courseRepo.findAll();

  }

  @Override
  public void create(Course courseDto) {
    courseRepo.create(courseDto);
  }

  @Override
  public void delete(int id) {
    courseRepo.delete(id);
  }

  @Override
  public void update(int id,Course dto) {
  courseRepo.update(id,dto);
  }
}
