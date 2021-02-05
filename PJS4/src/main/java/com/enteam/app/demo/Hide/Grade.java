package com.enteam.app.demo.Hide;

public class Grade {
    private int grade;
    private String matter;
    private String date;
    private String student;
    public Grade (String student,int grade, String matter, String date){
        this.student = student;
        this.grade = grade;
        this.matter = matter;
        this.date = date;
    }


    public int getGrade() {
        return grade;
    }

    public String getMatter() {
        return matter;
    }

    public String getDate() {
        return date;
    }
}
