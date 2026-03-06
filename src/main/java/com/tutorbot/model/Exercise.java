package com.tutorbot.model;

//Exercise model class (POJO)

public class Exercise {

    // Attributes
    private int id;
    private String topic;
    private String question;
    private String difficulty;

    // constructor
    public Exercise(int id, String topic, String question, String difficulty){     
        this.id = id;
        this.difficulty = difficulty; 
        this.question = question; 
        this.topic = topic; 
    };

    // getters and setters
    public void setTopic(String topic){ 
        this.topic = topic;
    }

    public void setId(int id){
        this.id = id; 
    }

    public void setDifficulty(String difficulty){
        this.difficulty = difficulty;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public String getTopic(){
        return this.topic;
    }

    public int getId(){
        return this.id;
    }

    public String getDifficulty(){
        return this.difficulty;
    }

    public String getQuestion(){
        return this.question;
    }

    //toString override in JSON format
    @Override
    public String toString() {
        return "{\n" +
                "  \"id\": " + id + ",\n" +
                "  \"topic\": \"" + topic + "\",\n" +
                "  \"question\": \"" + question + "\",\n" +
                "  \"difficulty\": \"" + difficulty + "\"\n" +
                "}";
    }
}
