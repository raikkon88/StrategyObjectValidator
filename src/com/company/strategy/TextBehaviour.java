package com.company.strategy;

import com.company.entities.TextQuestion;

public class TextBehaviour implements ValidatorBehaviour<TextQuestion>{

    /**
     * Specific TextQuestion comparator.
     * @param original acts as a template used to validate.
     * @param actual
     * @return
     */
    @Override
    public boolean validate(TextQuestion original, TextQuestion actual) {
        return actual.getAnswer().hasValidLength();
    }
}
