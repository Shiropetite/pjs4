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
    private int id_notification;
    private Date Date;
    private String content  ;
    private boolean hasBeenRead;



    @ManyToOne
    @JoinColumn(name = "id_student")
    private Student student;


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
