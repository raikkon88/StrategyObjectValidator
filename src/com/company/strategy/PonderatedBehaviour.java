package com.company.strategy;

import com.company.entities.PonderatedQuestion;
import com.company.entities.SelectionQuestion;

public class PonderatedBehaviour implements ValidatorBehaviour<PonderatedQuestion>  {

    @Override
    public boolean validate(PonderatedQuestion original, PonderatedQuestion actual) {
        System.out.println("Ponderated question behaviour");
        return false;
    }
}
