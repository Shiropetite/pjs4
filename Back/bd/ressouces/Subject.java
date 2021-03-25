package ressouces;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity(name = "Subject")
public class Subject {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String abbr;



    @OneToMany
    private List<Grade> ListGrades;

    public Subject() { }

    public Subject(String name, String abbr) {
        this.name = name;
        this.abbr = abbr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public List<Grade> getListGrades() {return ListGrades;}

    public void setListGrades(List<Grade> listGrades) {ListGrades = listGrades;}
}
