import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Course {

    @Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private int id_course;
    private Date date;
    private String name;
    private String room;
    private String teacher;

    @ManyToMany
    @JoinTable( name = "T_Course_Student_Associations",
            joinColumns = @JoinColumn( name = "id_course" ),
            inverseJoinColumns = @JoinColumn( name = "id_student" ) )
    private List<Student> students = new ArrayList<>();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentAt(int i) {
        return students.get(i);
    }




}