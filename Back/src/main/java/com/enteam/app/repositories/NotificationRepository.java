package com.enteam.app.repositories;

import com.enteam.app.ressouces.Notification;
import com.enteam.app.ressouces.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NotificationRepository extends JpaRepository<Notification,Long> {

    public Optional<Notification[]> findNotificationByOwner_Id(Long id);

}
