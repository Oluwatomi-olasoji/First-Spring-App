package com.example.demo.controllers;

import com.example.demo.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/students")
    public String getStudents(Model model){
        model.addAttribute("students", studentService.findAll());
        return "students";
    }
}
