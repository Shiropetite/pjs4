package com.enteam.app.controllers;

import com.enteam.app.notifying.Notification;
import com.enteam.app.services.NotificationFeedService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/NotificationFeed")
public class NotificationFeedController {

    private final NotificationFeedService notificationFeedService;

    public NotificationFeedController(NotificationFeedService notificationFeedService) {
        this.notificationFeedService = notificationFeedService;
    }

    @GetMapping
    public List<Notification> getNotificationFeed(){
        return Arrays.asList(
                new Notification("1","Absence","You were absent on the 36/02/24, please contact your administration to justify your absence","Important"),
                new Notification("2","Annonce","haha code funny","Basic")
        );
    }

    /*public List<Notification> getNotificationFeedFromId(@PathVariable("id") String id){
        //filters url that filter through
    }*/

}
