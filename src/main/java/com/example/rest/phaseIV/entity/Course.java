package com.example.rest.phaseIV.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// the anotation below will create getter and setter and constructors
// we can also do it easly by @data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Course {
    private int id;
    private String name;
    private String code;
}
