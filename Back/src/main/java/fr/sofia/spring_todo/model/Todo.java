package fr.sofia.spring_todo.model;

public class Todo {
    private static int cpt = 0;
    private int id;
    private String title;
    private String description;
    private boolean isChecked;

    public Todo(String title, String description) {
        this.id = ++cpt;
        this.title = title;
        this.description = description;
        this.isChecked = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

}
