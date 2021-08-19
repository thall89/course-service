package com.example.courseservice.repository;

import com.example.courseservice.model.Course;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

    public Course getCourseById(String id){
        Course course = new Course();
        course.setId(id);
        course.setName("name");
        course.setType("type");
        course.setUrl("url");
        return course;
    }

    public Course createCourse(Course course){
        Course course2 = new Course();
        course2.setId(String.valueOf(Math.random()*1000));
        course2.setName(course.getName());
        course2.setType(course.getType());
        course2.setUrl(course.getUrl());
        return course2;
    }
}
