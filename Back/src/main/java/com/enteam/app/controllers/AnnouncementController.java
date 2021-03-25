package com.enteam.app.controllers;

import com.enteam.app.repositories.AnnouncementRepository;
import com.enteam.app.repositories.StudentRepository;
import com.enteam.app.ressouces.Announcement;
import com.enteam.app.serviceImpl.AnnouncementServiceImpl;
import com.enteam.app.services.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/announcements")
public class AnnouncementController {
    private AnnouncementService announcementServices;

    @Autowired
    public AnnouncementController(StudentRepository studentRepository, AnnouncementRepository announcementRepository) {
      this.announcementServices = new AnnouncementServiceImpl(announcementRepository,studentRepository);
    }

    @GetMapping("{id}")
    public List<Announcement> getAnnouncements(@PathVariable("id") Long id_student){
        return this.announcementServices.getAnnouncements(id_student);
    }

}
