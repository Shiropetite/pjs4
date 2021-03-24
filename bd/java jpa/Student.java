import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Student {


    @javax.persistence.Id
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private int id_student;


    private String login;
    private String password;
    private String prenom;
    private String nom;
    private int groupe;

    @OneToMany( targetEntity=Todo.class, mappedBy="Student")
    private List<Todo> Todos= new ArrayList<>();

    @OneToMany( targetEntity=Notification.class, mappedBy="Student")
    private List<Notification> Notifications= new ArrayList<>();
    @ManyToMany
    @JoinTable( name = "T_Announcement_Student_Associations",
            joinColumns = @JoinColumn( name = "id_student" ),
            inverseJoinColumns = @JoinColumn( name = "id_announcement" ) )
    private List<Announcement> announcements = new ArrayList<>();
    @ManyToMany
    @JoinTable( name = "T_Course_Student_Associations",
            joinColumns = @JoinColumn( name = "id_student" ),
            inverseJoinColumns = @JoinColumn( name = "id_course" ) )
    private List<Course> Courses = new ArrayList<>();


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getGroupe() {
        return groupe;
    }

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }

    public void addTodo(Todo todo) {
        Todos.add(todo);
    }

    public Todo getTodoAt(int i) {
        return Todos.get(i);
    }

    public void addAnnouncement(Announcement Announcement) {
        announcements.add(Announcement);
    }

    public Announcement getAnnouncementAt(int i) {
        return announcements.get(i);
    }
    public void addNotification(Notification notif) {
        Notifications.add(notif);
    }

    public Notification getNotificationAt(int i) {
        return Notifications.get(i);
    }

    public void addCourse(Course Course) {
        Courses.add(Course);
    }

    public Course getCourseAt(int i) {
        return Courses.get(i);
    }


    // ... getters & setters ....
}
