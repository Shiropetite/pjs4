package com.enteam.app.repositories;

import com.enteam.app.ressouces.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementRepository extends JpaRepository<Notification,Long> {

}
