package com.exceptions;

public class MoodAnalayser {
    String message;

    public MoodAnalayser() {
    }

    public MoodAnalayser(String message) {
        this.message = message;
    }

    private String message;

    public MoodAnalayser() {
    }

    public MoodAnalayser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {
        try{
        if (message.contains("Sad")) {
            return "SAD";
        }
        } catch (NullPointerException e){
            return "HAPPY";
        }
        return null;

    }
}
