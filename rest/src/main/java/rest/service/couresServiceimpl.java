package rest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rest.entity.course;
import rest.repository.courseRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class couresServiceimpl implements courseService{
    public final courseRepository courseRepository;

    @Override
    public void delete(int id) {
       courseRepository.delete(id);
    }

    @Override
    public void save(course s) {
        courseRepository.save(s);

    }

    @Override
    public List<course> getAll() {
        return courseRepository.getAll();
    }

    @Override
    public course getById(int id) {
        return courseRepository.getById(id);
    }
}
