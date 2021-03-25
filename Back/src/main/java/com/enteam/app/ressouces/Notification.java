package com.enteam.app.ressouces;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "Notification")
public class Notification {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @NotNull
    private Date date;

    @NotNull
    private String content;

    @NotNull
    @ManyToOne
    private Student owner;

    public Notification() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }
}
