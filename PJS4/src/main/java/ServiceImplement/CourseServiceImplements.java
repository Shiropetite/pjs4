package ServiceImplement;

import Service.CourseService;
import com.enteam.app.demo.Course;

import java.util.ArrayList;
import java.util.Date;

public class CourseServiceImplements implements CourseService {
    private ArrayList<Course> courses = new ArrayList<Course>();
    @Override
    public ArrayList getCourse(int numGroupe, Date date) {
        return courses;
    }
}
