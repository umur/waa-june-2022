package miu.edu.phase3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseDto {
    private int id;
    private String name;
    private String code;
}
