package phaseI.miu.cs545.course.service.impl;

import phaseI.miu.cs545.course.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import phaseI.miu.cs545.course.entity.CourseDto;
import phaseI.miu.cs545.course.repository.CourseRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    @Override
    public List<CourseDto> findAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public void createNewCourse(CourseDto course) {
        courseRepository.create(course);
    }

    @Override
    public void updateCourse(CourseDto course, int id) {
        courseRepository.update(id, course);
    }

    @Override
    public void deleteCourse(int id) {
        courseRepository.delete(id);
    }
}
