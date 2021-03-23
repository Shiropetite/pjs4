package com.enteam.app.demo;

public class Student {
    private int id;
    private String email;
    private String password;
    private int group;

    public Student(int id, String email, String password, int group) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getGroup() {
        return group;
    }
}
