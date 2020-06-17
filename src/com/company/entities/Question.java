package com.company.entities;

import com.company.strategy.ValidatorBehaviour;

public abstract class Question {

    String questionCode;
    ValidatorBehaviour validatorBehaviour;

    public Question(String questionCode, ValidatorBehaviour behaviour){
        this.questionCode = questionCode;
        this.validatorBehaviour = behaviour;
    }

    /**
     * This method acts as a factory for validate behaviour.
     * It can be checked by a code or directly by the catch clause it types are incorrect
     * @param q Is the object used to validate this.
     * @return True if this is valid using q.
     */
    public boolean validate(Question q){
        try { // Ens protegim per si els question code venen incorrectes.
            if (questionCode.equals(q.questionCode)) {
                return validatorBehaviour.validate(this, q);
            } else {
                return false;
            }
        }
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionCode='" + questionCode + '\'' +
                '}';
    }
}
