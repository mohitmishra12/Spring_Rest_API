package com.springrest.springrest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.springrest.entity.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }
}
