package com.enteam.app.controllers;


import com.enteam.app.repositories.GradeRepository;
import com.enteam.app.ressouces.Grade;
import com.enteam.app.serviceImpl.GradesServiceImpl;
import com.enteam.app.services.GradesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/grades")
public class GradesController {
    private GradesService gradesService;

    @Autowired
    public GradesController(GradeRepository gradeRepository) {
        this.gradesService = new GradesServiceImpl(gradeRepository);
    }

    @GetMapping("{id}")
    public Grade[] getGrades (@PathVariable("id") Long id_student){
        return gradesService.getGrades(id_student);
    }

}
