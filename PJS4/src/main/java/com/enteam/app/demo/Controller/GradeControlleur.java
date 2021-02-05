package com.enteam.app.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeControlleur {
    private final IGrades grades;
    public GradeControlleur(IGrades grades){
        this.grades = grades;
    }
}
