package com.company.entities;


import com.company.strategy.SelectionBehaviour;

import java.util.ArrayList;
import java.util.List;

public class SelectionQuestion extends Question {

    List<Answer> options;

    public SelectionQuestion(String questionCode, SelectionBehaviour behaviour) {
        super(questionCode, behaviour);
        this.options = new ArrayList<Answer>();
        this.options.add(new Answer("answer 1", 10));
        this.options.add(new Answer("answer 2", 10));
    }

    public List<Answer> getOptions() {
        return options;
    }
}
