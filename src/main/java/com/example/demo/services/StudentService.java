package com.example.demo.services;

import com.example.demo.domain.Student;

public interface StudentService {

    public Iterable<Student> findAll();
}
