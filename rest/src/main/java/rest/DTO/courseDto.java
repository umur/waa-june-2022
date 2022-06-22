package rest.DTO;

import lombok.Data;
import rest.entity.course;
@Data
public class courseDto {
    private  int id;
    private String name;
    private String code;
    public courseDto todto(course course){
        courseDto dto=new courseDto();
        dto.setId(course.getId());
        dto.setName(course.getName());
        dto.setCode(course.getCode());
        return dto;

    }

    public courseDto toEntity(){
        courseDto dto=new courseDto();
        dto.setId(this.id);
        dto.setName(this.name);
        dto.setCode(this.code);
        return dto;

    }
}
