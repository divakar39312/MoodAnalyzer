package com.Bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//public class MoodAnalyzerTest {
//    MoodAnalyzer moodAnalyze = new MoodAnalyzer();
//
//    @Test
//    public void if_MessageWasSad_ShouldReturnSad(){
//        moodAnalyze.welcome();
//        String message = "I am in Happy Mood";
//        String result = moodAnalyze.moodCheck(message);
//        Assertions.assertEquals("SAD",result);
//    }
//}


public class MoodAnalyzerTest {
    @Test
    public void givenMessage_IsProper_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actualResult = moodAnalyzer.analyseMood("I am in Sad Mood");
        Assertions.assertEquals("SAD", actualResult);
    }


}