package com.example.demo.services;

import com.example.demo.domain.Course;

public interface CourseService {

    public Iterable<Course> findAll();
}
