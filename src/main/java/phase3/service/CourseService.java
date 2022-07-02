package phase3.service;

import phase3.dto.CourseDTO;

import java.util.List;

public interface CourseService {

    CourseDTO findById(Integer id);

    List<CourseDTO> findAll();

    Integer create(CourseDTO course);

    void update(Integer id, CourseDTO course);

    void delete(Integer id);
}
