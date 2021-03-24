package com.enteam.app.controllers;

import com.enteam.app.repositories.StudentRepository;
import com.enteam.app.ressouces.Student;
import com.enteam.app.serviceImpl.StudentServiceImpl;
import com.enteam.app.services.StudentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/student")
public class StudentController {
    private StudentService service;

    public StudentController(StudentRepository studentRepository) {
        this.service = new StudentServiceImpl(studentRepository);
    }

    public Student getStudent(String login, String password){
        return this.service.getStudent(login, password);
    }

    public Student getStudent(Long id_student){
        return this.service.getStudent(id_student);
    }

}
