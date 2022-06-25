package edu.miu.cs545.phaseIII.utils;

import edu.miu.cs545.phaseIII.dto.StudentDto;
import edu.miu.cs545.phaseIII.entity.Student;
import org.modelmapper.ModelMapper;

public class StudentUtils {
    private static final ModelMapper mapper = new ModelMapper();

    public static StudentDto parseStudentToStudentDto(Student student){
        return mapper.map(student, StudentDto.class);
    }
    public static Student parseStudentDtoToStudent(StudentDto studentDto){
        return mapper.map(studentDto, Student.class);
    }
}
