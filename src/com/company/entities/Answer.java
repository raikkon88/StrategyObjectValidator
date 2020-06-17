package com.company.entities;

public class Answer {

    private String text;
    private int maxLength;

    public Answer(String text, int maxLength){
        this.text = text;
        this.maxLength = maxLength;
    }

    public String getText() {
        return text;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public boolean hasValidLength() {
        return text.length() > 0 && text.length() <= maxLength;
    }
}
