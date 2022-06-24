package com.example.rest.phaseIV.service;

import com.example.rest.phaseIV.dto.CourseDto;
import com.example.rest.phaseIV.repo.CourseRepo;
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
