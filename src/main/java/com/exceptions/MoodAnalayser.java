package com.exceptions;

public class MoodAnalayser {

    private String message;

    public MoodAnalayser() {
    }

    public MoodAnalayser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }

    }
}
