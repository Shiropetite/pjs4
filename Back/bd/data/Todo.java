package data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;
import org.springframework.lang.NonNull;

import java.util.Date;
import javax.persistence.*;
import java.util.Set;
@Entity
public class Todo {
    @javax.persistence.Id
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private long id_Todo;
    @NonNull
    private String title;
    @NonNull
    private String description;
    @NonNull
    private boolean tick;
    private Date date;

    @ManyToOne @JoinColumn( name="id_student" )
    private Student student;

    public Todo(String title, String description, boolean tick, Date date){

        this.title = title;
        this.description = description;
        this.tick = tick;
        this.date = date;
    }

    public Todo(String title, String description, boolean tick){
        this.title = title;
        this.description = description;
        this.tick = tick;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isTick() {
        return tick;
    }

    public void setTick(boolean tick) {
        this.tick = tick;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        student = student;
    }

}
