package com.example.demo.services;

import com.example.demo.domain.Student;
import com.example.demo.repositories.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }
}
