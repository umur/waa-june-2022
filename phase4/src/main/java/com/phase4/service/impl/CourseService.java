package com.phase4.service.impl;

import com.phase4.Utilities.ModelMapperUti;
import com.phase4.domain.Course;
import com.phase4.dto.CourseDto;
import com.phase4.repository.CourseRepo;
import com.phase4.service.ServiceInit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CourseService implements ServiceInit<CourseDto> {
    private final CourseRepo courseRepo;
    private final ModelMapperUti modelMapperUti;
    public List<CourseDto> getAll(){return modelMapperUti.mapList(courseRepo.getAll(), CourseDto.class);}
    public void save(CourseDto c){
        courseRepo.save(modelMapperUti.map(c, Course.class));}
    public void delete(Long id){
        courseRepo.delete((id));}
    public void update(Long id,CourseDto c) { courseRepo.update(id,modelMapperUti.map(c,Course.class));}
    public CourseDto getById(Long id) {return modelMapperUti.map(courseRepo.getByPK(id),CourseDto.class);}
}

