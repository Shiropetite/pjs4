package ressouces;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Student")
@Table(
        name = "student",
        uniqueConstraints = {
                @UniqueConstraint(name = "student_email_unique", columnNames = "email")
        }
)
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String prenom;

    @NotNull
    private String nom;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    @ManyToOne
    private GroupStudent studentGroup;

    @OneToMany
    private List<Grade> ListGrades;

    public Student() { }

    public Student(String prenom, String nom, String email, String password, GroupStudent studentGroup) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.password = password;
        this.studentGroup = studentGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public GroupStudent getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(GroupStudent studentGroup) {
        this.studentGroup = studentGroup;
    }
}
