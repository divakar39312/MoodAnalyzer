package com.Bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyze = new MoodAnalyzer();

    @Test
    public void if_MessageWasSad_ShouldReturnSad() {
        moodAnalyze.welcome();

        String message = "I am in SAD Mood";
        String mood = moodAnalyze.moodCheck(message);
        Assertions.assertEquals("SAD", mood);

    }
}
