package com.todoapp.todoapplication.controllers;

import com.todoapp.todoapplication.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> allCourses() {
        return Arrays.asList(
                new Course(1L, "ij", "yuguiklm"),
                new Course(2L, "jnklm", "yuguiklm"),
                new Course(2L, "jnklm", "yuguiklm")
        );
    }
}
