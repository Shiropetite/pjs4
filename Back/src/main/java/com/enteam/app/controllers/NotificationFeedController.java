package com.enteam.app.controllers;

import com.enteam.app.repositories.NotificationRepository;
import com.enteam.app.ressouces.Notification;
import com.enteam.app.serviceImpl.NotificationServiceImpl;
import com.enteam.app.services.NotificationFeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/notificationFeed")
public class NotificationFeedController {
    private NotificationFeedService service;

    @Autowired
    public NotificationFeedController(NotificationRepository repository) {
        this.service = new NotificationServiceImpl(repository);
    }

    @GetMapping("{id}")
    public List<Notification> getNotificationFeed(@PathVariable("id") Long id){
        return Arrays.asList(this.service.getNotificationFeedByUserOrderByDate(id).clone());
    }

    @DeleteMapping("{id}")
    public boolean clearNotificationFeedItem(@PathVariable("id") Long i){
        return this.service.clearNotif(i);
    }

}
