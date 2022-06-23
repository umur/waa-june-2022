package com.phase4.domain;

import lombok.*;

@Data
public class Course {
    private Long id;
    private String name;
    private String code;

    public Course() {}

    public Course(Long id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }
}
