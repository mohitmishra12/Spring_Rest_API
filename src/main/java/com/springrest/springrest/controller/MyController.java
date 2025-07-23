package com.springrest.springrest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.courseService.getCourses(Long.parseLong(courseId));
    }


    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {

        return this.courseService.addCoures(course);

    }

    @PutMapping("/courses")
    public Course UpdateCourse(@RequestBody Course course) {

        return this.courseService.UpdateCoures(course);
    }
}
