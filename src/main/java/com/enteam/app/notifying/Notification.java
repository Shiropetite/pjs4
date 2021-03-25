package com.enteam.app.notifying;

import java.util.Date;

public class Notification {

    private String label;
    private Integer id;
    private Date date;
    private String content;
    private Integer user;

    public Notification(Integer id,String lab,String desc,Integer s,Date d){
        this.label= lab;
        this.id = id;
        this.content = desc;
        this.user = s;
        this.date=d;
    }

    public String getLabel(){
        return this.label;
    }
    public Integer getId(){
        return this.id;
    }
    public String getDescription(){
        return this.content;
    }
    public Integer getType(){
        return this.user;
    }
    public Date getDate(){return this.date;}
}
