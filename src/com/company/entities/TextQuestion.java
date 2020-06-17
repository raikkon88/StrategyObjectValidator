package com.company.entities;


import com.company.strategy.TextBehaviour;

public class TextQuestion extends Question {

    private Answer answer;

    public TextQuestion(String questionCode, int maxLength, TextBehaviour behaviour) {
        super(questionCode, behaviour);
        answer = new Answer("text answer", maxLength);
    }

    public Answer getAnswer() {
        return answer;
    }
}
