package com.enteam.app.controllers;

import com.enteam.app.ressouces.Announcement;
import com.enteam.app.serviceImpl.AnnouncementServiceImplement;
import com.enteam.app.services.AnnouncementService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/announcements")
public class AnnouncementController {
    private AnnouncementService announcementServices;

    public AnnouncementController() {
        this.announcementServices = new AnnouncementServiceImplement();
    }

    @GetMapping
    public List getAnnouncements(){
        return this.announcementServices.getAnnouncements();
    }

}
