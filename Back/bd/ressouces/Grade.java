package ressouces;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name ="grade")
public class Grade {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @NotNull
    private long grade;
    @NotNull
    private long grademax;
    @NotNull
    private long coefficient;
    @NotNull
    private String name;

    @NotNull
    @ManyToOne
    private Student student;

    @NotNull
    @ManyToOne
    private Subject subject;

    public Grade(long grade, long grademax, long coefficient, String name, Student student, Subject subject) {
        this.grade = grade;
        this.grademax = grademax;
        this.coefficient = coefficient;
        this.name = name;
        this.student = student;
        this.subject = subject;
    }


    public long getGrade() {
        return grade;
    }

    public void setGrade(long grade) {
        this.grade = grade;
    }

    public long getGrademax() {
        return grademax;
    }

    public void setGrademax(long grademax) {
        this.grademax = grademax;
    }

    public long getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(long coefficient) {
        this.coefficient = coefficient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }



}
