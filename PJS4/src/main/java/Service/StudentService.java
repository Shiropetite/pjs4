package Service;

import com.enteam.app.demo.Student;

public interface StudentService {
    public Student getStudent(String login, String password);
    public Student getStudent(int id);
}
