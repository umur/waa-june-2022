package miu.edu.phase3.service.impl;

import lombok.AllArgsConstructor;
import miu.edu.phase3.dto.CourseDto;
import miu.edu.phase3.entity.Course;
import miu.edu.phase3.repo.CourseRepo;
import miu.edu.phase3.service.CourseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    @Autowired
    private  final CourseRepo courseRepo;

    private final ModelMapper mapper;

    @Override
    public List<CourseDto> findAll() {
        var courses = courseRepo.findAll();
        var result = new ArrayList<CourseDto>();

        for(Course course: courses) {
            var crsDto = mapper.map(course, CourseDto.class);
            result.add(crsDto);
        }
        return result;
    }

    @Override
    public CourseDto findOne(int id) {
        return mapper.map(courseRepo.findOne(id), CourseDto.class);
    }

    @Override
    public CourseDto create(CourseDto course) {
        courseRepo.create(mapper.map(course, Course.class));
        return course;
    }

    @Override
    public CourseDto update(CourseDto course, int id) {
        courseRepo.update(mapper.map(course,Course.class), id);
        return course;
    }

    @Override
    public void delete(int id) {
        courseRepo.delete(id);
    }
}
