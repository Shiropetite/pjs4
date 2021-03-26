package com.enteam.app.services;

import com.enteam.app.ressouces.Notification;

public interface NotificationFeedService {

    public Notification[] getNotificationFeedByUserOrderByDate(Long id_student);

    public boolean clearNotif(Long id_notification);

}
