package com.example.courseservice.controller;

import com.example.courseservice.model.Course;
import com.example.courseservice.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController2 {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public Course getCourseById(Course course){
        return courseRepository.getCourseById(course.getId());
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course){
        System.out.println(course.getName());
        return courseRepository.createCourse(course);
    }
}
