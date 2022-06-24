package rest4.service;

import rest4.DTO.courseDto;

import java.util.List;

public interface courseService {
    void delete(int id);
    void save(courseDto s);
    List<courseDto> getAll();
    courseDto getById(int id);
}
