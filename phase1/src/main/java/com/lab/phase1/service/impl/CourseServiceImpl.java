package com.lab.phase1.service.impl;

import com.lab.phase1.model.Course;
import com.lab.phase1.repo.CourseRepo;
import com.lab.phase1.service.CourseService;
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
        var result = new ArrayList<Course>();

        for (Course course: courses) {
            result.add(course);
        }
        return result;
    }

    @Override
    public void create(Course course) {
        courseRepo.create(course);
    }

    @Override
    public void delete(int id) {
        courseRepo.deleteById(id);
    }

    @Override
    public void update(Course course, int id) {
        courseRepo.updateById(course, id);
    }

}
