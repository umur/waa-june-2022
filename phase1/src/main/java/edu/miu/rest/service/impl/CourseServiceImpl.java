package edu.miu.rest.service.impl;

import edu.miu.rest.service.CourseService;
import edu.miu.rest.entity.Course;
import edu.miu.rest.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepo courseRepo;

    @Override
    public List<Course> findAll() {
        var courses = courseRepo.findAll();
        return courses;
    }
}
