package com.example.kim.googlefeud;

public class Question {
    private String QUESTION;
    private String ANS1;
    private String ANS2;
    private String ANS3;

    public Question(String question, String ans1, String ans2, String ans3) {
        QUESTION = question;
        ANS1 = ans1;
        ANS2 = ans2;
        ANS3 = ans3;
    }

    public String getQuestion() {
        return QUESTION;
    }
    public String ans1() {
        return ANS1;
    }
    public String ans2() {
        return ANS2;
    }
    public String ans3() {
        return ANS3;
    }
}
