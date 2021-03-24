package Repository;

import com.enteam.app.demo.Announcement;
import com.enteam.app.demo.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository <Course, Long> {
    Optional<Course>[] findCourseBynumGroupeAndDate();
}
