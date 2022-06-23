package edu.miu.rest.service.impl;

import edu.miu.rest.dto.CourseDto;
import edu.miu.rest.entity.Course;
import edu.miu.rest.repository.CourseRepo;
import edu.miu.rest.service.CourseService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;
    private final ModelMapper modelmapper = new ModelMapper();

    @Override
    public List<CourseDto> findAll() {
        var courses = courseRepo.findAll();
        var result = new ArrayList<CourseDto>();

        for (Course course : courses) {
            CourseDto dto = new CourseDto();
            var courseDto = modelmapper.map(course , CourseDto.class);
            result.add(courseDto);
        }
        return result;

    }

    @Override
    public void create(CourseDto courseDto) {
        Course course =  modelmapper.map(courseDto , Course.class);
        courseRepo.create(course);
    }
    @Override
    public void update(CourseDto courseDto)
    {
        Course course = modelmapper.map(courseDto , Course.class);
        courseRepo.update(course);
    }

    @Override
    public void delete(CourseDto courseDto)
    {
        Course course = modelmapper.map(courseDto , Course.class);
        courseRepo.delete(course);
    }
}
