package com.enteam.app;

public class Todo {

    private String user;
    private String id;
    private String title;
    private String description;
    private boolean tick;

    public Todo(String user, String id, String title, String description, boolean tick) {
        this.user = user;
        this.id = id;
        this.title = title;
        this.description = description;
        this.tick = tick;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
