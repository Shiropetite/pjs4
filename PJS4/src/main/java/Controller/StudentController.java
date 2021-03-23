package Controller;

import Service.StudentService;
import com.enteam.app.demo.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/Student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student getStudent(String login, String password){
        return studentService.getStudent(login, password);
    }

    public Student getStudent(int id_student){
        return studentService.getStudent(id_student);
    }

}
