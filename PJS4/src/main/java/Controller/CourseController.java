package Controller;

import Service.CourseService;
import com.enteam.app.demo.Course;
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

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    public ArrayList<Course> getCourses (int numGroupe){
        return courseService.getCourse(numGroupe, new Date());
    }

    public ArrayList<Course> getCourses (int numGroupe, Date date){
        return courseService.getCourse(numGroupe, date);
    }

}
