package Controller;

import Service.AnnouncementService;
import com.enteam.app.demo.Announcement;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/Announcement")
public class AnnouncementController {
    private ArrayList<Announcement> announcements;

    @PostMapping
    public ArrayList postAnnouncement (){
       return announcements;
    }

    public void addAnnouncements(@PathVariable("id") String id){

    }
}
