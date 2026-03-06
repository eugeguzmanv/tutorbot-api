package com.tutorbot.model;

 // Student model class (POJO)
public class Student {

    // class fields
    private int id;
    private String name;
    private String email;
    private String level;

    //constructor
    public Student(int id, String name, String email, String level){ 
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.level = level; 
    }

    // Getters and Setters: 
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setLevel(String level){
        this.level = level;
    }

    public int getId(){ 
        return this.id; 
    }

    public String getName(){ 
        return this.name; 
    }

    public String getEmail(){
        return this.email;
    }

    public String getLevel(){
        return this.level;
    }

    //toString override in JSON format
    @Override
    public String toString() {
        
        return "{\n" +
                "  \"id\": " + id + ",\n" +
                "  \"name\": \"" + name + "\",\n" +
                "  \"email\": \"" + email + "\",\n" +
                "  \"level\": \"" + level + "\"\n" +
                "}";
    }
}
