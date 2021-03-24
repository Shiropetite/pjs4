package com.enteam.app.ressouces;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private Date date;

    @NotNull
    private String title;

    @NotNull
    private String description;

    @NotNull
    private boolean tick = false;

    @ManyToOne
    private Student owner;

    public Todo() { }

    public Todo(Integer student, Date date, String title, String description, boolean tick) {
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

    public Student getUser() {
        return owner;
    }

    public void setUser(Student owner) {
        this.owner = owner;
    }

    public boolean isTick() {
        return tick;
    }

    public void setTick() {
        this.tick = !this.tick;
    }

    public boolean isEqual(Todo todo){/*
        return this.user.equals(todo.getUser())
                && this.id.equals(todo.id)
                && this.title.equals(todo.getTitle())
                && this.date.equals(todo.getDate())
                && this.description.equals(todo.getDescription())
                && this.tick == todo.isTick();
                */
        return false;
    }
}
