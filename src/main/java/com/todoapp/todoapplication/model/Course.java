package com.todoapp.todoapplication.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Course {
    private Long id;
    private String name;
    private String author;

    public Course(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
}
