package com.phase3.repository;

import com.phase3.domain.Course;
import com.phase3.dto.CourseDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo {

    private static List<Course> courses = new ArrayList<>();
    private ModelMapper modelMapper = new ModelMapper();

    static {
        courses.add(new Course(1L,"WAA","CS-543"));
        courses.add(new Course(2L,"MWA","CS-546"));
    }

    public Course insert(CourseDto courseDto) {
        Course course = modelMapper.map(courseDto, Course.class);
        courses.add(course);
        return course;
    }

    public Course update(Long id, CourseDto courseDto) {
        Course course = modelMapper.map(courseDto, Course.class);
        Course oldCourse = courses.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(oldCourse != null) {
            courses.remove(oldCourse);
            course.setId(id);
            courses.add(course);
            return course;
        }

        return null;
    }

    public Course delete(int id) {
        Course course = courses.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(course != null) {
            courses.remove(course);
            return course;
        }

        return null;
    }

    public Course getByPK(int id) {
        return courses.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }
}
