package ServiceImplement;

import Repository.CourseRepository;
import Service.CourseService;
import com.enteam.app.demo.Announcement;
import com.enteam.app.demo.Course;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class CourseServiceImplements implements CourseService {
    private CourseRepository courseRepository;

    public CourseServiceImplements (CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }
    @Override
    public ArrayList<Course> getCourse(int numGroupe, Date date) {
        ArrayList<Course> courses = new ArrayList<Course>();
        Optional<Course>[] course = courseRepository.findCourseBynumGroupeAndDate();
        for (Optional<Course> c: course) {
            courses.add(c.get());
        }
        return courses;
    }
}
