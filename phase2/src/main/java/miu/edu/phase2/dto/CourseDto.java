package miu.edu.phase2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseDto {
    private int id;
    private String name;
    private String code;
}
