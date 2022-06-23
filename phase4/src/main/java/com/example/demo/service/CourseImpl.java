package com.example.demo.service;



import com.example.demo.dto.CourseDto;
import com.example.demo.entity.Course;
import com.example.demo.repo.CourseRepo;
import com.example.demo.util.ListMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseImpl implements CourseService {
  @Autowired
  CourseRepo courseRepo;
  @Autowired
  ListMapper<Course, CourseDto> listMapper;
  @Autowired
  ModelMapper modelMapper;

  @Override
  public List<CourseDto> findAll() {


    return (List<CourseDto>) listMapper.mapList(courseRepo.findAll(), new CourseDto());
  }

  @Override
  public void create(CourseDto courseDto) {
    Course course = modelMapper.map(courseDto, Course.class);
    courseRepo.create(course);
  }

  @Override
  public void delete(int id) {
    courseRepo.delete(id);
  }

  @Override
  public void update(int id, CourseDto dto) {

    courseRepo.update(id, modelMapper.map(dto,Course.class));
  }
}
