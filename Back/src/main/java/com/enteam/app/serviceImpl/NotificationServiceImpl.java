package com.enteam.app.serviceImpl;

import com.enteam.app.repositories.NotificationRepository;
import com.enteam.app.ressouces.Notification;
import com.enteam.app.services.NotificationFeedService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationServiceImpl implements NotificationFeedService {

    private NotificationRepository notificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public Notification[] getNotificationFeedByUserOrderByDate(Long id_student) {
        Optional<Notification[]> notifications = this.notificationRepository.findNotificationByOwner_Id(id_student);
        return notifications.orElse(null);
    }

    //Permet de supprimer la notif passee en parametre
    @Override
    public boolean clearNotif(Long id_notification) {
        Optional<Notification> notification = this.notificationRepository.findById(id_notification);
        if (notification.isPresent()) {
            this.notificationRepository.delete(notification.get());
            return true;
        }
        return false;
    }

    public boolean addNotiftoFeed(Notification notification) {
        this.notificationRepository.saveAndFlush(notification);
        return true;
    }

}
