package com.enteam.app.dto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class NotificationDTO {

    private String label;
    private String id;
    private String description;
    private String type;

    @PostMapping
    public void createTodo(@RequestBody NotificationDTO dto){

    }
}
