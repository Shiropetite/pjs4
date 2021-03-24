package Repository;

import com.enteam.app.demo.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
    Optional<Announcement>[] findAnnouncementByNumGroupe(ArrayList<Integer> numGroup);
}
