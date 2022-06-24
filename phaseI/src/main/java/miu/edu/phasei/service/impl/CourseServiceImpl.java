package miu.edu.phasei.service.impl;

import lombok.AllArgsConstructor;
import miu.edu.phasei.entity.Course;
import miu.edu.phasei.repo.CourseRepo;
import miu.edu.phasei.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    @Autowired
    private  final CourseRepo courseRepo;


    @Override
    public List<Course> findAll() {
        var courses = courseRepo.findAll();
        var result = new ArrayList<Course>();

        for(Course course: courses) {
            result.add(course);
        }
        return result;
    }

    @Override
    public Course findOne(int id) {
        return courseRepo.findOne(id);
    }

    @Override
    public Course create(Course course) {
        courseRepo.create(course);
        return course;
    }

    @Override
    public Course update(Course course, int id) {
        courseRepo.update(course, id);
        return course;
    }

    @Override
    public void delete(int id) {
        courseRepo.delete(id);
    }
}
