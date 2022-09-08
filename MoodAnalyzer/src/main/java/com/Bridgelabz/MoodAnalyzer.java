package com.Bridgelabz;

//public class MoodAnalyzer {
    //Welcome Function
//    public static void welcome(){
//        System.out.println("Welcome to Mood Analyzer");
//
//    }
    //Function to Check Mood of a String
//    public String moodCheck(String message){
//        if(message.contains("Sad")) {
//            System.out.println("In SAD Mood");
//            return "SAD";
//        }
//        else{
//            System.out.println("In HAPPY Mood");
//            return "HAPPY";
//        }
//    }
//}


public class MoodAnalyzer {
    public String analyseMood(String message) {
        if (message.contains("Any Mood")){
            return "HAPPY";
        }
        else {
            return "SAD";
        }
    }
}

