package Service;

import com.enteam.app.demo.Course;

import java.util.ArrayList;
import java.util.Date;

public interface CourseService {
    public ArrayList<Course> getCourse(int numGroupe, Date date);
}
