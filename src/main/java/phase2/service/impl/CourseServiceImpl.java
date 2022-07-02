package phase2.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import phase2.dto.CourseDTO;
import phase2.repo.CourseRepository;
import phase2.service.CourseService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public List<CourseDTO> findAll() {
        return courseRepository.findAll()
                .stream()
                .map(CourseDTO::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CourseDTO findById(Long id) {
        return CourseDTO.toDTO(courseRepository.findById(id));
    }

    @Override
    public Integer create(CourseDTO courseDTO) {
        return courseRepository.save(CourseDTO.toCourse(courseDTO));
    }

    @Override
    public void update(Integer id, CourseDTO course) {
        courseRepository.update(id, CourseDTO.toCourse(course));
    }

    @Override
    public void delete(Integer id) {
        courseRepository.delete(id);
    }
}
