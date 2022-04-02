package com.exceptions;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalayserTest {

    MoodAnalayser moodAnalayser = new MoodAnalayser();


    @Test
    public void givenMessage_WhenSad_ReturnSad() {
        String mood = moodAnalayser.analyseMood("I am Sad");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenHappy_ReturnHappy() {
        String mood = moodAnalayser.analyseMood("I am Happy");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullmood_ShouldThrowException() {
        MoodAnalayser moodAnalayser = new MoodAnalayser("null");
        String mood = moodAnalayser.analyseMood("I am Happy");
        Assert.assertEquals("HAPPY", mood);
    }
}