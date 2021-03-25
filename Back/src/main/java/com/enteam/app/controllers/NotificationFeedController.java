package com.enteam.app.controllers;

import com.enteam.app.ressouces.Notification;
import com.enteam.app.services.NotificationFeedService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/notificationFeed")
public class NotificationFeedController {

    private final NotificationFeedService notificationFeedService;

    public NotificationFeedController(NotificationFeedService notificationFeedService) {
        this.notificationFeedService = notificationFeedService;
    }

    @GetMapping
    public List<Notification> getNotificationFeed(){
        return Arrays.asList();
    }

}
