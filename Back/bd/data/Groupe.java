package data;

import com.sun.istack.NotNull;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Groupe {
    @javax.persistence.Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private long id_groupe;
    @NotNull
    private String nom;


    @OneToMany( targetEntity= Student.class, mappedBy="Student")
    private List<Student> Todos= new ArrayList<>();

    @ManyToMany
    /*@JoinTable( name = "T_Course_Groupe_Associations",
            joinColumns = @JoinColumn( name = "id_groupe" ),
            inverseJoinColumns = @JoinColumn( name = "id_course" ) )*/
    private List<Course> Courses = new ArrayList<>();
    @ManyToMany
    /*@JoinTable( name = "T_Announcement_Groupe_Associations",
            joinColumns = @JoinColumn( name = "id_groupe" ),
            inverseJoinColumns = @JoinColumn( name = "id_announcement" ) )*/
    private List<Announcement> announcements = new ArrayList<>();



    public Groupe(String nom) {
        this.nom = nom;

    }


}
