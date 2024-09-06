package com.example.demo.services;

import com.example.demo.domain.Course;
import com.example.demo.repositories.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Iterable<Course> findAll() {
        return courseRepository.findAll();
    }
}
