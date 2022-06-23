package rest.cs545_waa_lab2_dto.entity;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Course {
    private int id;
    private String courseName;
    private String code;
}