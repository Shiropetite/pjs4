package com.enteam.app.ressouces;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

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

    public Student() { }

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
