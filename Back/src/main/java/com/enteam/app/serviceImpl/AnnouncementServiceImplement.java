package com.enteam.app.serviceImpl;

import com.enteam.app.ressouces.Announcement;
import com.enteam.app.ressouces.Todo;
import com.enteam.app.services.AnnouncementService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnnouncementServiceImplement implements AnnouncementService {
    private List<Announcement> annoucements;

    public AnnouncementServiceImplement() {
        this.annoucements = new ArrayList<>();
        //this.annoucements.add(new Announcement(1L,new Date(120, 7, 20),"Sebastien Martin","Retour en presentiel","blablbalbalbalbalblablablablablbalbalbalb"));
    }

    @Override
    public List getAnnouncements() {
        return this.annoucements;
    }
}
