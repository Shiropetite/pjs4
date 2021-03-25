package com.enteam.app.repositories;

import com.enteam.app.ressouces.Announcement;
import com.enteam.app.ressouces.GroupStudent;
import com.enteam.app.ressouces.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement,Long> {

    public Optional<Announcement[]> findAnnouncementsByGroupsContaining(GroupStudent group);

}
