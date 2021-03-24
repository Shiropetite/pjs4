package data;

import com.sun.istack.NotNull;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;
import java.util.Date;
import javax.persistence.*;
import java.util.Set;
@Entity
public class Notification {@javax.persistence.Id
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private long id_notification;
    @NotNull
    private Date Date;
    @NotNull
    private String content;
    private boolean hasBeenRead = false;



    @ManyToOne
   // @JoinColumn(name = "id_student")
    private Student student;

    public Notification(Student student, Date date, String content){
        this.student = student;
        this.Date = date;
    }


    public Date getDate() {

        return Date;
    }

    public void setDate(Date Date) {

        this.Date = Date;
    }

    public String getcontent() {

        return content;
    }

    public void setcontent(String content) {

        this.content = content;
    }

    public boolean ishasBeenRead () {
        return hasBeenRead ;
    }

    public void sethasBeenRead (boolean hasBeenRead ) {
        this.hasBeenRead  = hasBeenRead ;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
