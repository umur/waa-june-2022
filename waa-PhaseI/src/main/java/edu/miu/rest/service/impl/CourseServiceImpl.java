package edu.miu.rest.service.impl;


import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import edu.miu.rest.repo.CourseRepo;
import edu.miu.rest.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;

    @Override
    public List<Course> findAll() {
        var courses = courseRepo.findAll();
        return courses;
    }

    @Override
    public void create(Course entity) {
        courseRepo.create(entity);
    }

    @Override
    public void delete(int id) {
        List<Course> courseList = findAll();
        for(Course entity:courseList){
            if(id == entity.getId()){
                courseRepo.delete(entity);
                break;
            }
        }
    }

    @Override
    public void update(Course entity,int id) {
        List<Course> courseList = findAll();
        for(Course course:courseList){
            if(id == course.getId()){
                course = entity;
            }
        }
        courseRepo.update(courseList);
    }

}
