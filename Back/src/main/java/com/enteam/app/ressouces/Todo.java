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

    @NotNull
    @ManyToOne
    private Student owner;

    public Todo() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public boolean isTick() {
        return tick;
    }

    public void setTick(boolean tick) {
        this.tick = tick;
    }

    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }
}
