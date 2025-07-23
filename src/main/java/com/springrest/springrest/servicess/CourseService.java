package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entity.Course;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCourses( long courseId);

//    public  Course addCourse(Course course);


    com.springrest.springrest.entity.Course addCoures(com.springrest.springrest.entity.Course course);

    com.springrest.springrest.entity.Course UpdateCoures(com.springrest.springrest.entity.Course course);
}
