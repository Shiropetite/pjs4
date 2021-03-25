package com.enteam.app.ressouces;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity(name = "Course")
public class Course {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Date date;

    @NotNull
    @ManyToOne
    private Subject subject; // matiere

    @NotNull
    private String room;

    @NotNull
    private String teacher;

    @ManyToMany
    private List<GroupStudent> groups;

    public Course() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<GroupStudent> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupStudent> groups) {
        this.groups = groups;
    }
}
