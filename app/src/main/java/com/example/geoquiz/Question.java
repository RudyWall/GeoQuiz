package com.example.geoquiz;

public class Question {
    int textResId;
    boolean answer;

    public int getTextResId() {
        return textResId;
    }

    public void setTextResId(int textResId) {
        this.textResId = textResId;
    }

    Question(int textResId, boolean answer) {
        this.textResId = textResId;
        this.answer = answer;
    }
}
