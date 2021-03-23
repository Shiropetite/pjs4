package com.enteam.app.demo;

import java.util.ArrayList;
import java.util.Date;

public class Course {
    private int id;
    private Date date;
    private String room;
    private String teacher;
    private ArrayList numGroupe;

    public Course(int id, Date date, String room, String teacher, ArrayList numGroupe) {
        this.id = id;
        this.date = date;
        this.room = room;
        this.teacher = teacher;
        this.numGroupe = numGroupe;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getRoom() {
        return room;
    }

    public String getTeacher() {
        return teacher;
    }

    public ArrayList<Integer> getNumGroupe() {
        return numGroupe;
    }
}
