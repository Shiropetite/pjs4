package com.enteam.app.notifying;

public class Notification {

    private String label;
    private String id;
    private String description;
    private String type;

    public Notification(String id,String lab,String desc,String type){
        this.label= lab;
        this.id = id;
        this.description = desc;
        this.type = type;
    }

    public String getLabel(){
        return this.label;
    }
    public String getId(){
        return this.id;
    }
    public String getDescription(){
        return this.description;
    }
    public String getType(){
        return this.type;
    }
}
