package com.enteam.app;

import java.util.Date;

public class Todo {
    private static int cpt = 0;
    private int id;

    private String user;
    private String title;
    private Date date;
    private String description;
    private boolean tick;

    public Todo(String user,Date date, String title, String description) {
        this.user = user;
        this.id = cpt++;
        this.date = date;
        this.title = title;
        this.description = description;
        this.tick = false;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isTick() {
        return tick;
    }

    public void setTick(boolean tick) {
        this.tick = tick;
    }
}
