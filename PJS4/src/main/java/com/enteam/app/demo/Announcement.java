package com.enteam.app.demo;

import java.util.Date;

public class Announcement {
    private int id;
    private Date date;
    private String autor;
    private String title;
    private String content;


    public Announcement(int id, Date date,  String autor, String title, String content) {
        this.id = id;
        this.date = date;
        this.autor = autor;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
