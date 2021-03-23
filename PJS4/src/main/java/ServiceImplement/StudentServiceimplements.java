package ServiceImplement;

import Service.StudentService;
import com.enteam.app.demo.Student;

import java.util.ArrayList;

public class StudentServiceimplements implements StudentService {
    ArrayList<Student> students = new ArrayList<Student>();
    {
        students.add(new Student(1, "jean-didier@etu.parisBranlos.com", "ore ore ore ore", 202));
        students.add(new Student(2, "return.to.monke@etu.parisBranlos.com", "king kong > godzilla", 911));
        students.add(new Student(3, "Yacinee@etu.parisBranlos.com", "Bonsoir", 105));
        students.add(new Student(4, "Dartek@etu.parisBranlos.com", "espece d'envuleur d'arbre", 207));
        students.add(new Student(5, "JMI@etu.parisBranlos.com", "HTML !", 103));

    }


    @Override
    public Student getStudent(String login, String password) {
        for (Student s: students) {
            if(login.equals(s.getEmail()) && password.equals(s.getPassword())){
                return s;
            }
        }
        return null;
    }

    @Override
    public Student getStudent(int id) {
        for (Student s: students) {
            if(id == s.getId()){
                return s;
            }
        }
        return null;
    }
}
