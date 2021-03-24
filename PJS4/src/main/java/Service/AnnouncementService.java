package Service;

import com.enteam.app.demo.Announcement;

import java.util.ArrayList;

public interface AnnouncementService {
    public ArrayList<Announcement> addAnnouncement(ArrayList<Integer> numGroupe);
    public void supressAnnouncement(int id_Announcement);
}
