package phase2.service;

import phase2.dto.CourseDTO;

import java.util.List;

public interface CourseService {
    Integer create(CourseDTO course);

    void update(Integer id, CourseDTO course);

    void delete(Integer id);

    CourseDTO findById(Long id);

    List<CourseDTO> findAll();
}
