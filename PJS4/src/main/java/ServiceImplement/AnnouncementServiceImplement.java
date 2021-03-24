package ServiceImplement;

import Repository.AnnouncementRepository;
import Service.AnnouncementService;
import com.enteam.app.demo.Announcement;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class AnnouncementServiceImplement implements AnnouncementService {

    private AnnouncementRepository announcementRepository;

    public AnnouncementServiceImplement (AnnouncementRepository announcementRepository){

    }

    @Override
    public ArrayList<Announcement> addAnnouncement(ArrayList<Integer> numGroup) {
        ArrayList<Announcement> announcements = new ArrayList<Announcement>();
        Optional<Announcement>[] announcement = announcementRepository.findAnnouncementByNumGroupe(numGroup);
        for (Optional<Announcement> a: announcement) {
            Date date = a.get().getDate();
            date.setMonth(+3);
            if(date.before(new Date()))
            {
            supressAnnouncement(a.get().getId());
            }
            else{
                announcements.add(a.get());
            }
        }
        return announcements;
    }

    @Override
    public void supressAnnouncement(int id_Announcement) {

    }
}
