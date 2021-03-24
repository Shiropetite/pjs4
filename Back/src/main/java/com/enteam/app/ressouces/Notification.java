package com.enteam.app.ressouces;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Notification {
    private String label;
    private String id;
    private String description;
    private String type;

    public Notification(String label, String id, String description, String type) {
        this.label = label;
        this.id = id;
        this.description = description;
        this.type = type;
    }
}
