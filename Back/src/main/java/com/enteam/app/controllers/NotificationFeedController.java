package com.enteam.app.controllers;

import com.enteam.app.repositories.StudentRepository;
import com.enteam.app.ressouces.Notification;
import com.enteam.app.ressouces.Student;
import com.enteam.app.services.NotificationFeedService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.JstlUtils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/notificationFeed")
public class NotificationFeedController {

    private final NotificationFeedService notificationFeedService;
    private StudentRepository studentRepository;

    public NotificationFeedController(NotificationFeedService notificationFeedService, StudentRepository studentRepository) {
        this.notificationFeedService = notificationFeedService;
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public List<Notification> getNotificationFeed(){
        return Arrays.asList(
                new Notification(1,new Date(),"Va manger tes morts", this.studentRepository.findById(1L).orElse(null))
        );
    }

}
