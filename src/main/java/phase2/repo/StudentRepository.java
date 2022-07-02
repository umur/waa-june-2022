package phase2.repo;

import org.springframework.stereotype.Repository;
import phase2.entity.Course;
import phase2.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

@Repository
public class StudentRepository {

    private List<Student> students = new ArrayList<>();


    public Student findById(Long id) {
        return students.stream()
                .filter(it -> Objects.equals(it.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public Integer save(Student student) {
        Integer id = new Random().nextInt(1000);
        student.setId(id);
        students.add(student);
        return id;
    }

    public void update(Integer id, Student student) {

        int idx = -1;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                idx = i;
                break;
            }
        }

        if (idx == -1) throw new RuntimeException("NOT_FOUND");

        student.setId(id);

        students.set(idx, student);
    }

    public List<Student> getStudentsByMajor(String major) {
        return students.stream()
                .filter(student -> student.getMajor().equals(major))
                .collect(Collectors.toList());

    }

    public List<Course> findCoursesByStudentId(Integer id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .flatMap(student -> student.getCourses().stream())
                .toList();
    }

}
