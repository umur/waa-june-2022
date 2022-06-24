package rest.service;

import rest.DTO.courseDto;

import java.util.List;

public interface courseService {
    void delete(int id);
    void save(courseDto s);
    List<courseDto> getAll();
    courseDto getById(int id);
}
