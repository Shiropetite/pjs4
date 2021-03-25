package com.enteam.app.serviceImpl;

import com.enteam.app.notifying.Notification;
import com.enteam.app.services.NotificationFeedService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationFeedService {
    private ArrayList<Notification> dataBank = new ArrayList<Notification>();
    {
        dataBank.add(new Notification(1, "Nouveau message!", "blabla!", 1, new Date(185, Calendar.SEPTEMBER,2)));
    }
    @Override
    public List<Notification> getNotificationFeedByUserOrderByDate(Integer i) {
        return dataBank;
    }


    //Permet de supprimer la notif passee en parametre
    public boolean clearNotif(Integer i){
        Notification toDelete = null;
        for (Notification notif : dataBank) {
            if (notif.getId().equals(i)) toDelete = notif;
        }
        if(toDelete == null) return false;
        dataBank.remove(toDelete);
        return true;
    }

    public boolean addNotiftoFeed(Notification notification){
        List<Notification> tmp = this.getNotificationFeedByUserOrderByDate(notification.getId());
        if(tmp.size() >= 5){
            dataBank.remove(tmp.get(tmp.size()-1));
        }
        dataBank.add(notification);
        return true;
    }
}
