package data;

import com.sun.istack.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private long id_course;
    private Date date;
    @NotNull
    private String name;
    private String room;
    @NotNull
    private String teacher;

    @ManyToMany
    /*@JoinTable( name = "T_Course_Groupe_Associations",
            joinColumns = @JoinColumn( name = "id_course" ),
            inverseJoinColumns = @JoinColumn( name = "id_groupe" ) )*/
    private List<Groupe> Groupes = new ArrayList<>();

    public Course(String name, String teacher){
        this.name = name;
        this.teacher = teacher;
    }
    public Course(String name, String teacher, String room, Date date){
        this.date = date;
        this.room = room;
        this.name = name;
        this.teacher = teacher;
    }
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






}