package com.company.strategy;

import com.company.entities.SelectionQuestion;

public class SelectionBehaviour implements ValidatorBehaviour<SelectionQuestion> {
    @Override
    public boolean validate(SelectionQuestion original, SelectionQuestion actual) {
        return original.getOptions().size() == actual.getOptions().size();
    }
}

