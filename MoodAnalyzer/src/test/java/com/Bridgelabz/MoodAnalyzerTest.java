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


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
        // Test case for return SAD if message contains sad
    void messageSad_returnSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
        String result = moodAnalyzer.analyzeMood();
        System.out.println(result);
        Assertions.assertEquals("SAD" , result);
    }
    @Test
        // Test case for Return Happy if message doesnot contain sad
    void messageAnyThing_ReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String result = moodAnalyzer.analyzeMood();
        System.out.println(result);
        Assertions.assertEquals("HAPPY", result);
    }
}