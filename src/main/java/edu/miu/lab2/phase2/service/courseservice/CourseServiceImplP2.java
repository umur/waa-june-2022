package edu.miu.lab2.phase2.service.courseservice;

import edu.miu.lab2.phase2.dto.CourseDto;
import edu.miu.lab2.phase2.entity.Course;
import edu.miu.lab2.phase2.repo.CourseRepoP2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImplP2 implements CourseService {

    private final CourseRepoP2 courseRepo;

    @Override
    public List<CourseDto> getCourseDto() {
        var courses=courseRepo.findCourse();
        var result=new ArrayList<CourseDto>();
        for(Course course:courses){
            CourseDto dto=new CourseDto();
            var courseDto=dto.toDto(course);
            result.add(courseDto);
        }
        return result;

    }

    @Override
    public void createCourse(CourseDto courseDto) {
        courseRepo.createCourse(courseDto.toEntity());
    }

    @Override
    public void deleteCourse(int id) {
        courseRepo.deleteCourse(id);
    }

    @Override
    public void updateCourse(CourseDto c, int id) {
        courseRepo.updateCourse(c.toEntity(),id);
    }

}
