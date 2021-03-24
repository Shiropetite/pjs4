package Controller;

import Repository.AnnouncementRepository;
import Service.AnnouncementService;
import ServiceImplement.AnnouncementServiceImplement;
import com.enteam.app.demo.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/Announcement")
public class AnnouncementController {
    private ArrayList<Announcement> announcements;
    private AnnouncementService service;
    @Autowired
    public AnnouncementController (AnnouncementRepository announcementRepository){
        service = new AnnouncementServiceImplement(announcementRepository);
    }

    @PostMapping
    public ArrayList postAnnouncement (){
       return announcements;
    }

    public void addAnnouncements(@PathVariable("numGroupe") ArrayList<Integer> numGroupe){
        service.addAnnouncement(numGroupe);
    }
}
