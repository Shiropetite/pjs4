package com.enteam.app.controllers;

import com.enteam.app.notifying.Notification;
import com.enteam.app.services.NotificationFeedService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/NotificationFeed")
public class NotificationFeedController {

    private final NotificationFeedService notificationFeedService;

    public NotificationFeedController(NotificationFeedService notificationFeedService) {
        this.notificationFeedService = notificationFeedService;
    }

    @GetMapping
    public List<Notification> getNotificationFeedByUser(Integer i){
        return notificationFeedService.getNotificationFeedByUserOrderByDate(i);
    }

    @GetMapping
    public boolean clearNotificationFeedItem(Integer i){
        return notificationFeedService.clearNotif(i);
    }

}
