package rest4.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class studentNameDto {
    private int id;
    private String firstName;
    private String astName;
}
