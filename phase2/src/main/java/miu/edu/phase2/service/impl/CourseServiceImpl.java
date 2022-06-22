package miu.edu.phase2.service.impl;

import lombok.AllArgsConstructor;
import miu.edu.phase2.dto.CourseDto;
import miu.edu.phase2.repo.CourseRepo;
import miu.edu.phase2.service.CourseService;
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
    public List<CourseDto> findAll() {
        var courses = courseRepo.findAll();
        var result = new ArrayList<CourseDto>();

        for(CourseDto course: courses) {
            result.add(course);
        }
        return result;
    }

    @Override
    public CourseDto findOne(int id) {
        return courseRepo.findOne(id);
    }

    @Override
    public CourseDto create(CourseDto course) {
        courseRepo.create(course);
        return course;
    }

    @Override
    public CourseDto update(CourseDto course, int id) {
        courseRepo.update(course, id);
        return course;
    }

    @Override
    public void delete(int id) {
        courseRepo.delete(id);
    }
}
