package com.example.rest.phaseIII.service;

import com.example.rest.phaseIII.dto.CourseDto;
import com.example.rest.phaseIII.repo.CourseRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepo courseRepo;
    @Override
    public List<CourseDto> findAll() {
        var courses  = courseRepo.findAll();
        return null;
    }
}
