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
    public String message;
    //constructor
    public MoodAnalyzer(String message){
        this.message = message;
        analyzeMood();
    }
    public String analyzeMood(){
        try {
            if (message.contains("sad"))
                // if message contains sad it will return sad
                return "SAD";
            else if (message.contains("happy"))
                // if message will not contain sad then it will return Happy
                return "HAPPY";
        }
        catch (NullPointerException e){
            System.out.println("Enter Valid Mood");
        }
        return " ";
    }
}