package com.exceptions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalayserTest {
    MoodAnalayser moodAnalayser = new MoodAnalayser();

    @Test
    public void givenMessage_WhenSad_ReturnSad() {
        String mood = moodAnalayser.analyseMood("I am Sad");
        Assert.assertEquals("SAD", mood);
    }

}