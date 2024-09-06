package com.example.demo.bootstrap;

import com.example.demo.domain.Course;
import com.example.demo.domain.Student;
import com.example.demo.repositories.CourseRepository;
import com.example.demo.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class databootstrap implements CommandLineRunner {
    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;

    public databootstrap(CourseRepository courseRepository, StudentRepository studentRepository) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       //Creating some students
        Student tolu = new Student();
        tolu.setName("Tolu");

        Student akwaeke = new Student();
        akwaeke.setName("Akwaeke");

        //Creating some courses
        Course math101 = new Course();
        math101.setCourseName("Math 101");
        math101.setDescription(" First year pure maths");

        Course csc101 = new Course();
        csc101.setCourseName("CSC 101");
        csc101.setDescription(" Intoduction to computer science");

        Course gst201 = new Course();
        gst201.setCourseName("GST 201");
        gst201.setDescription(" Second year philosphy");

        //Adding courses to student and students to courses
        tolu.getCourses().add(gst201);
        tolu.getCourses().add(csc101);

        gst201.getStudents().add(tolu);
        csc101.getStudents().add(tolu);

        akwaeke.getCourses().add(math101);
        akwaeke.getCourses().add(csc101);

        math101.getStudents().add(akwaeke);
        csc101.getStudents().add(akwaeke);

        //Saving data in repositories
        Student savedtolu = studentRepository.save(tolu);
        Student savedakwaeke = studentRepository.save(akwaeke);

        Course savedMth101 = courseRepository.save(math101);
        Course savedCsc101 = courseRepository.save(csc101);
        Course savedGst201 = courseRepository.save(gst201);



    }
}
