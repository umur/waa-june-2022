package edu.miu.phase3.services;

import edu.miu.phase3.dto.CourseDto;
import edu.miu.phase3.dto.StudentDto;
import edu.miu.phase3.entity.Course;
import edu.miu.phase3.entity.Student;
import edu.miu.phase3.repository.StudentRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private ModelMapper modelMapper;
    private static int idIncrement = 1;

    public List<Student> findAllStudents(){
        return studentRepo.findAll();
    }
    public List<Student> getStudentsByMajor(String major){
        return studentRepo.findByMajor(major);
    }
    public List<Course> getCoursesByStudentId(int studentId){
        Student student = studentRepo.findById(studentId);
        return  student.getCoursesTaken();
    }
    public Student findStudentById(int id) {
        return studentRepo.findById(id);
    }

    public Student createStudent(StudentDto studentDto) {
        Student student = toStudent(studentDto);
        studentRepo.createOne(student);
        return student;
    }

    public Student updateStudent(StudentDto studentDto) throws Exception {
        Student student = toStudent(studentDto);
        return studentRepo.updateOne(student);
    }

    public Student removeStudentById(int studentId) throws Exception {
       return studentRepo.removeById(studentId);
    }

    public Student toStudent(StudentDto studentDto) {
        List<Course> courseList = new ArrayList<>();
        for(CourseDto courseDto: studentDto.getCoursesTaken()) {
            Course newCourse = modelMapper.map(courseDto, Course.class);
            //Course newCourse = new Course(courseDto.getId(), courseDto.getName(), courseDto.getCode());
            courseList.add(newCourse);
        }

        Student student = modelMapper.map(studentDto, Student.class);
        student.setCoursesTaken(courseList);

        if(studentDto.getId() == 0) {
            student.setId(idIncrement++);
        }
        return student;
    }
}
