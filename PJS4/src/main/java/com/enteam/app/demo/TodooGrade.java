package com.enteam.app.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TodooGrade {
    private ArrayList <Grade> grades;

    public TodooGrade (){
        grades = new ArrayList<>();
        grades.add(new Grade("Enzo",15,"Math","2001-26-01"));
        grades.add(new Grade("Victor",3,"CPOAV", "1495-03-12"));
    }

}
