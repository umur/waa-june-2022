package edu.miu.cs545.phaseIII.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseDto implements Serializable {
    private int id;
    private String name;
    private String code;
}
