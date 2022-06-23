package edu.miu.rest.service.impl;

import edu.miu.rest.entity.Course;
import edu.miu.rest.repository.CourseRepo;
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
       return courseRepo.findAll();
    }

    @Override
    public void create(Course course) {
        courseRepo.create(course);
    }
    @Override
    public void update(Course course)
    {
        courseRepo.update(course);
    }

    @Override
    public void delete(Course course)
    {
        courseRepo.delete(course);
    }
}
