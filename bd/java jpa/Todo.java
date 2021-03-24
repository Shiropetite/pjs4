import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;
import java.util.Date;
import javax.persistence.*;
import java.util.Set;
@Entity
public class Todo {
    @javax.persistence.Id
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private int id_Todo;

    private String title;
    private String description;

    private boolean tick;

    private Date date;


    @ManyToOne @JoinColumn( name="id_student" )
    private Student student;


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
