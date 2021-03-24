package data;

import com.sun.istack.NotNull;
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
    private long id_announcement;
    @NotNull
    private Date date;
    @NotNull
    private String author  ;
    @NotNull
    private String Title  ;
    @NotNull
    private String content  ;

    public Announcement(Date date, String author, String title, String content) {
        this.date = date;
        this.author = author;
        Title = title;
        this.content = content;
    }

    @ManyToMany
   /* @JoinTable( name = "T_Announcement_Student_Associations",
            joinColumns = @JoinColumn( name = "id_announcement" ),
            inverseJoinColumns = @JoinColumn( name = "id_student" ) )*/
    private List<Groupe> groupes = new ArrayList<>();



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

    public void addGroupe(Groupe groupe){
        groupes.add(groupe);
    }





}


