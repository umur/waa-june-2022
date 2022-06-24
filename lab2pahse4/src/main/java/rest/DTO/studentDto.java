package rest.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class studentDto {
    private int id;
    private String firstName;
    private String astName;
    private String email;
    private String major;
    private String coursesTaken;
    private double gpa;
}

