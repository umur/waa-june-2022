package phase1.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import phase1.entity.Course;
import phase1.repo.CourseRepository;
import phase1.service.CourseService;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course findById(Integer id) {
        return courseRepository.findById(id);
    }

    @Override
    public Integer create(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void update(Integer id, Course course) {
        courseRepository.update(id, course);
    }

    @Override
    public void delete(Integer id) {
        courseRepository.delete(id);
    }
}
