package data;
import com.sun.istack.NotNull;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {


    @javax.persistence.Id
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private long id_student;

    public Student(String login, String password, String prenom, String nom) {
        this.login = login;
        this.password = password;
        this.prenom = prenom;
        this.nom = nom;
    }

    @NotNull
    private String login;
    @NotNull
    private String password;
    @NotNull
    private String prenom;
    @NotNull
    private String nom;
    private Integer groupe;

    @OneToMany( targetEntity= Todo.class, mappedBy="Student")
    private List<Todo> Todos= new ArrayList<>();

    @OneToMany( targetEntity= Notification.class, mappedBy="Student")
    private List<Notification> Notifications= new ArrayList<>();




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


    public void addNotification(Notification notif) {
        Notifications.add(notif);
    }

    public Notification getNotificationAt(int i) {
        return Notifications.get(i);
    }


}
