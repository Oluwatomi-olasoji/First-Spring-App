package com.example.demo.repositories;

import com.example.demo.domain.Course;
import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, Long> {
}
