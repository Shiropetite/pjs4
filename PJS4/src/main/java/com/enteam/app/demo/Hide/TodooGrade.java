package com.enteam.app.demo.Hide;

import com.enteam.app.demo.Controller.IGrades;
import com.enteam.app.demo.Hide.Grade;

import java.util.ArrayList;

public class TodooGrade implements IGrades {
    private ArrayList <Grade> grades;

    public TodooGrade (){
        grades = new ArrayList<>();
        grades.add(new Grade("Enzo",15,"Math","2001-26-01"));
        grades.add(new Grade("Victor",3,"CPOAV", "1495-03-12"));
    }

}
