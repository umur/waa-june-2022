package edu.miu.lab2.phase1.service.courseservice;

import edu.miu.lab2.phase1.entity.Course;
import edu.miu.lab2.phase1.repo.CourseRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {


    private final CourseRepo courseRepo;

    @Override
    public List<Course> getCourse() {
        return courseRepo.findCourse();
    }

    @Override
    public void createCourse(Course course) {
        courseRepo.createCourse(course);
    }

    @Override
    public void deleteCourse(int id) {
        courseRepo.deleteCourse(id);
    }

    @Override
    public void updateCourse(Course c, int id) {
        courseRepo.updateCourse(c,id);
    }
}
