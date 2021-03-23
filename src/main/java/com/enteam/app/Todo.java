package com.enteam.app;

import java.util.Date;

public class Todo {

    private Integer user;
    private Integer id;
    private Date date;
    private String title;
    private String description;
    private boolean tick;

    public Todo(Integer user, Integer id, Date date, String title, String description, boolean tick) {
        this.user = user;
        this.id = id;
        this.date = date;
        this.title = title;
        this.description = description;
        this.tick = tick;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate(){return date;}

    public void setDate(Date date){this.date=date;}

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

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public boolean isTick() {
        return tick;
    }

    public void setTick() {
        this.tick = !this.tick;
    }

    public boolean isEqual(Todo todo){
        return this.user.equals(todo.getUser())
                && this.id.equals(todo.id)
                && this.title.equals(todo.getTitle())
                && this.date.equals(todo.getDate())
                && this.description.equals(todo.getDescription())
                && this.tick == todo.isTick();
    }
}
