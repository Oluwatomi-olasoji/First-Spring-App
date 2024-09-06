package com.example.demo.controllers;

import com.example.demo.services.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseContoller {

    private final CourseService courseService;


    public CourseContoller(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping("/courses")
    public String getCourses(Model model) {
        model.addAttribute("courses", courseService.findAll());
        return "courses";

    }
}
