package com.company.strategy;

import com.company.entities.Question;

public interface ValidatorBehaviour<T extends Question> {

    boolean validate(T original, T actual);

}
