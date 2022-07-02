package phase3.controller;

import com.waa.lab.one.phase.three.dto.CourseDTO;
import com.waa.lab.one.phase.three.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/{id}")
    public ResponseEntity<CourseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<CourseDTO>> findAll(){
        return ResponseEntity.ok(courseService.findAll());
    }

    @PostMapping
    public Long create(@RequestBody CourseDTO course) {
        return courseService.create(course);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody CourseDTO course) {
        courseService.update(id, course);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        courseService.delete(id);
        return ResponseEntity.ok().build();
    }


}
