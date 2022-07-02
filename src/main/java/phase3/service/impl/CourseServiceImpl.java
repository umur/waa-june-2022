package phase3.service.impl;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.jmx.export.naming.IdentityNamingStrategy;
import org.springframework.stereotype.Service;
import phase3.dto.CourseDTO;
import phase3.entity.Course;
import phase3.repo.CourseRepository;
import phase3.service.CourseService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper=new ModelMapper();

    @Override
    public List<CourseDTO> findAll() {
        return courseRepository.findAll()
                .stream()
                .map(c->modelMapper.map(c,CourseDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public CourseDTO findById(Integer id) {
        return modelMapper.map(courseRepository.findById(id),CourseDTO.class);
    }

    @Override
    public Integer create(CourseDTO courseDTO) {
        return courseRepository.save(modelMapper.map(courseDTO, Course.class));
    }

    @Override
    public void update(Integer id, CourseDTO course) {
        courseRepository.update(id, modelMapper.map(course,Course.class));
    }

    @Override
    public void delete(Integer id) {
        courseRepository.delete(id);
    }
}
