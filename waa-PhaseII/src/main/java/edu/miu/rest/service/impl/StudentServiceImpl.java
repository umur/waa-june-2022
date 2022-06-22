package edu.miu.rest.service.impl;

import edu.miu.rest.dto.CourseDto;
import edu.miu.rest.dto.StudentDto;
import edu.miu.rest.entity.Course;
import edu.miu.rest.entity.Student;
import edu.miu.rest.repo.StudentRepo;
import edu.miu.rest.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public List<StudentDto> findAll() {
        var students = studentRepo.findAll();
        var result = new ArrayList<StudentDto>();

        for (Student student : students) {
            StudentDto dto = new StudentDto();
            var studentDto = dto.toDto(student);
            result.add(studentDto);
        }
        return result;
    }

    @Override
    public List<StudentDto> getStudentsByMajor(String major) {
        List<StudentDto> studentDtoList = findAll();
        List<StudentDto> rsList = new ArrayList<>();
        if(studentDtoList != null && studentDtoList.size()>0){
            for(StudentDto studentDto: studentDtoList){
                if(studentDto.getMajor().equals(major)){
                    rsList.add(studentDto);
                }
            }
        }
        return rsList;
    }

    @Override
    public List<CourseDto> getCoursesByStudentId(int studentId) {
        List<StudentDto> studentDtoList = findAll();
        List<CourseDto> rsList = new ArrayList<>();
        if(studentDtoList != null && studentDtoList.size()>0){
            for(StudentDto studentDto: studentDtoList){
                if(studentDto.getId()==studentId){
                    var result = new ArrayList<CourseDto>();
                    for (Course course : studentDto.getCourses()) {
                        CourseDto dto = new CourseDto();
                        var courseDto = dto.toDto(course);
                        result.add(courseDto);
                    }
                    rsList = result;
                }
            }
        }
        return rsList;
    }

    @Override
    public void create(StudentDto dto) {
       var entity = dto.toEntity();
        studentRepo.create(entity);
    }

    @Override
    public void delete(int id) {
        List<StudentDto> studentDtoList = findAll();
        for(StudentDto dto:studentDtoList){
            if(id == dto.getId()){
                studentRepo.delete(dto.toEntity());
                break;
            }
        }
    }

    @Override
    public void update(StudentDto dto,int id) {
        List<StudentDto> studentDtoList = findAll();
        List<Student> studentList = new ArrayList<>();
        for(StudentDto studentDto:studentDtoList){
            if(id == studentDto.getId()){
                studentDto = dto;
            }
            var entity = studentDto.toEntity();
            studentList.add(entity);
        }
        studentRepo.update(studentList);
    }
}
