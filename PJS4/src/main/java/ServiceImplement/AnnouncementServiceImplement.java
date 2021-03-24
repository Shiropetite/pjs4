package ServiceImplement;

import Repository.AnnouncementRepository;
import Service.AnnouncementService;
import com.enteam.app.demo.Announcement;

import java.util.ArrayList;
import java.util.Optional;

public class AnnouncementServiceImplement implements AnnouncementService {

    private AnnouncementRepository announcementRepository;

    public AnnouncementServiceImplement (AnnouncementRepository announcementRepository){

    }

    @Override
    public Announcement addAnnouncement(ArrayList<Integer> numGroup) {
        Optional<Announcement>[] announcement = announcementRepository.findAnnouncementByNumGroupe(numGroup);
        for (Optional<Announcement> a: announcement) {
            if ()
        }
    }

    @Override
    public void supressAnnouncement(int id_Announcement) {

    }
}
