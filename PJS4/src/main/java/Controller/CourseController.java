package Controller;

import Repository.CourseRepository;
import Service.CourseService;
import ServiceImplement.CourseServiceImplements;
import com.enteam.app.demo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/Course")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseRepository courseRepository) {
        this.courseService = new CourseServiceImplements(courseRepository);
    }

    public ArrayList<Course> getCourses (int numGroupe){
        return courseService.getCourse(numGroupe, new Date());
    }

    public ArrayList<Course> getCourses (int numGroupe, Date date){
        return courseService.getCourse(numGroupe, date);
    }

}
