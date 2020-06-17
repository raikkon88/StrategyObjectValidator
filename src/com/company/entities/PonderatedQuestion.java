package com.company.entities;

import com.company.strategy.ValidatorBehaviour;

public class PonderatedQuestion extends Question{

    private String ponderated;

    public PonderatedQuestion(String questionCode, ValidatorBehaviour behaviour) {
        super(questionCode, behaviour);
        ponderated = "jajajajajajaja";
    }
}
