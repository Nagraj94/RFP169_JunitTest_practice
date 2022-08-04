package com.bridgelabz;

public class MoodAnalyser {
    public String moodAnalyser(String message){
        if (message.contains("SAD")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
