package com.tutorbot.model;

/**
 * Feedback model class (POJO)
 */
public class Feedback {
    private int studentId;
    private int exerciseId;
    private String answer;
    private int score;
    private String message;
    private boolean correct;

    // no-arg constructor
    public Feedback() {}

    // all-args constructor
    public Feedback(int studentId, int exerciseId, String answer, int score, String message, boolean correct) {
        this.studentId = studentId;
        this.exerciseId = exerciseId;
        this.answer = answer;
        this.score = score;
        this.message = message;
        this.correct = correct;
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setExerciseId(int exerciseId) {
        this.exerciseId = exerciseId;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    // Getters
    public int getStudentId() {
        return this.studentId;
    }

    public int getExerciseId() {
        return this.exerciseId;
    }

    public String getAnswer() {
        return this.answer;
    }

    public int getScore() {
        return this.score;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean getCorrect() {
        return this.correct;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"studentId\": " + studentId + ",\n" +
                "  \"exerciseId\": \"" + exerciseId + "\",\n" +
                "  \"answer\": \"" + answer + "\",\n" +
                "  \"score\": \"" + score + "\"\n" +
                "  \"message\": \"" + message + "\"\n" +
                "  \"correct\": \"" + correct + "\"\n" +
                "}";
        }
    }


