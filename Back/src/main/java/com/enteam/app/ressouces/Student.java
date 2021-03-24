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
    private String email;

    @NotNull
    private String password;

    @NotNull
    private int studentGroup;

    public Student() { }

    public Student(String email, String password, int studentGroup) {
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

    public int getGroup() {
        return studentGroup;
    }

    public void setGroup(int groupe) {
        this.studentGroup = groupe;
    }

}
