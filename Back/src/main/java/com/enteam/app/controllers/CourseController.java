package com.enteam.app.controllers;

import com.enteam.app.repositories.CourseRepository;
import com.enteam.app.repositories.GroupStudentRepository;
import com.enteam.app.repositories.StudentRepository;
import com.enteam.app.ressouces.Course;
import com.enteam.app.serviceImpl.CourseServiceImpl;
import com.enteam.app.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/course")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(StudentRepository studentRepository, GroupStudentRepository groupStudentRepository) {
        this.courseService = new CourseServiceImpl(studentRepository, groupStudentRepository);
    }

    @GetMapping("{id}")
    public List<Course> getCourses (@PathVariable("id") Long id_student){
        return courseService.getCourses(id_student);
    }

}
