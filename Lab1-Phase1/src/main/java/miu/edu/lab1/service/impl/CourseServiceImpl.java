package miu.edu.lab1.service.impl;

import lombok.AllArgsConstructor;
import miu.edu.lab1.entity.Course;
import miu.edu.lab1.repo.CourseRepo;
import miu.edu.lab1.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepo courseRepo;

    @Override
    public List<Course> findAll(){
        var courses= courseRepo.findAll();
        var result = new ArrayList<Course>();

        for (Course course : courses) {
            result.add(course);
        }
        return result;
    }

    @Override
    public void create(Course course){
        courseRepo.create(course);

    }

    @Override
    public void delete(int id){
        courseRepo.delete(id);

    }

    @Override
    public void update(int id, Course c){
        courseRepo.update(id, c);
    }
}
