package ressouces;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "Announcement")
public class Announcement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Date date;

    @NotNull
    private String author;

    @NotNull
    private String title;

    @NotNull
    private String content;

    @NotNull
    @ManyToMany
    private List<GroupStudent> groups;

    public Announcement(Date date, String author, String title, String content, List<GroupStudent> groups) {
        this.date = date;
        this.author = author;
        this.title = title;
        this.content = content;
        this.groups = groups;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<GroupStudent> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupStudent> groups) {
        this.groups = groups;
    }
}
