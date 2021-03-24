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
        return Arrays.asList(
                new Notification(1,new Date(121,3,20),"You were absent on the 36/02/24, please contact your administration to justify your absence"),
                new Notification(2,new Date(121,2,20),"haha code funny")
        );
    }

}
