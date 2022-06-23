package com.sudip.lab2.phase1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private int id;
    private String name;
    private String code;

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (!(object instanceof Course)) return false;
        Course course = (Course) object;
        return this.id == course.getId();
    }
}
