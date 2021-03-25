package ressouces;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "GroupStudent")
public class GroupStudent {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;



    @NotNull
    private int number;

    @OneToMany
    private List<Student> students = new ArrayList<>();

    public GroupStudent( int number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
