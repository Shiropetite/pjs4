package com.enteam.app.services;

import com.enteam.app.ressouces.Announcement;

import java.util.List;

public interface AnnouncementService {

    public List<Announcement> getAnnouncements(long id_student);

}
