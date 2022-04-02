package com.exceptions;

public class MoodAnalayser {

    public String analyseMood(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }

    }
}
