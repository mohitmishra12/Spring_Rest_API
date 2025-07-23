package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.springrest.springrest.entity.Course;

@Service
public class CourseServiceImpl implements com.springrest.springrest.services.CourseService {

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(1, "Java Backend", " Java , Spring Boot , Microservices"));
        list.add(new Course(2, "Frontend Basics", "Learn HTML, CSS, JS"));
        list.add(new Course(3, "Database", "MySQL , Postgres SQL , SQL ,MongoDB,NoSQL"));
        list.add(new Course(4, " Dev tool", "GIT,Docker,jenkins,vs code"));
        list.add(new Course(5, "Full Stack DEV", "Java,spring boot, react.js,node.js "));
    }

    @Override
    public List<Course> getCourses() {
        return list;

    }

    @Override
    public Course getCourses(long courseId) {
        Course c = null;
        for (Course course : list) {
            if (course.getId() == courseId) {
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCoures(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course UpdateCoures(Course course) {
        list.add(course);
        return course;

    }
    }


