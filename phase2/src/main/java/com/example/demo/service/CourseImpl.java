package com.example.demo.service;

import com.example.demo.dto.CourseDTO;
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
  public List<CourseDTO> findAll() {
     List<Course> courseList=courseRepo.findAll();
    List<CourseDTO> dtos = new ArrayList<>();
    for (Course course:courseList
         ) {
      CourseDTO courseDTO = new CourseDTO();
      CourseDTO courseDTO1= courseDTO.toDto(course);
      dtos.add(courseDTO1);
    }
    return dtos;
  }

  @Override
  public void create(CourseDTO courseDto) {
   Course course=  courseDto.toEntity();
    courseRepo.create(course);
  }

  @Override
  public void delete(int id) {
    courseRepo.delete(id);
  }

  @Override
  public void update(int id,CourseDTO dto) {
    Course course= dto.toEntity();
  courseRepo.update(id,course);
  }
}
