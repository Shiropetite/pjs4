package com.enteam.app.services;

import com.enteam.app.notifying.Notification;

import java.util.List;

public interface NotificationFeedService {
    List<Notification> getNotificationFeedByUserOrderByDate(Integer i);
    boolean clearNotif(Integer i);
}
