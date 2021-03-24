package com.enteam.app.controllers;

import com.enteam.app.repositories.StudentRepository;
import com.enteam.app.ressouces.Student;
import com.enteam.app.serviceImpl.StudentServiceImpl;
import com.enteam.app.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/student")
public class StudentController {
    private StudentService service;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.service = new StudentServiceImpl(studentRepository);
    }

    @GetMapping
    public Student getStudent(String login, String password){
        return this.service.getStudent(login, password);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") Long id_student){
        return this.service.getStudent(id_student);
    }

}
