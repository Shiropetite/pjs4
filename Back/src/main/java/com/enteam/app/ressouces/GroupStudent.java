package com.enteam.app.ressouces;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "GroupStudent")
public class GroupStudent {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private int number;

    public GroupStudent() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
