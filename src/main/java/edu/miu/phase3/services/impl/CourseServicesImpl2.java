package edu.miu.phase2.services.impl;

import edu.miu.phase2.dto.CourseDto;
import edu.miu.phase2.repository.CourseRepo2;
import edu.miu.phase2.services.CourseServices2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServicesImpl2 implements CourseServices2 {

    private final CourseRepo2 courseRepo;

    @Override
    public List<CourseDto> getCourses() {
        return courseRepo.getCourses().stream().map(c -> new CourseDto().toDto(c)).toList();
    }

    @Override
    public void updateCourse(CourseDto course, int id) {
        courseRepo.updateCourse(course.toEntity(), id);
    }

    @Override
    public void addCourse(CourseDto course) {
        this.courseRepo.addCourse(course.toEntity());
    }

    @Override
    public void deleteCourse(int id) {
        this.courseRepo.deleteCourse(id);
    }

}
