import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Announcement {


    @javax.persistence.Id
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private int id_announcement;
    private Date date;
    private String author  ;
    private String Title  ;
    private String content  ;

    @ManyToMany
    @JoinTable( name = "T_Announcement_Student_Associations",
            joinColumns = @JoinColumn( name = "id_announcement" ),
            inverseJoinColumns = @JoinColumn( name = "id_student" ) )
    private List<Student> students = new ArrayList<>();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Student getStudentAt(int i){
        return students.get(i);
    }




}


