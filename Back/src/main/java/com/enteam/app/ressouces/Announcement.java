package com.enteam.app.ressouces;

import java.util.Date;

public class Announcement {
    private int id;
    private Date date;
    private String author;
    private String title;
    private String content;

    public Announcement(int id, Date date,  String author, String title, String content) {
        this.id = id;
        this.date = date;
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
