package rest.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rest.entity.course;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class courseDto {
    private  int id;
    private String name;
    private String code;
//    public courseDto todto(course course){
//        courseDto dto=new courseDto();
//        dto.setId(course.getId());
//        dto.setName(course.getName());
//        dto.setCode(course.getCode());
//        return dto;
//
//    }
//
//    public courseDto toEntity(){
//        courseDto dto=new courseDto();
//        dto.setId(this.id);
//        dto.setName(this.name);
//        dto.setCode(this.code);
//        return dto;
//
//    }
}
