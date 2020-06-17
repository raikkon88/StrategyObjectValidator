package com.company;

import com.company.entities.PonderatedQuestion;
import com.company.entities.Question;
import com.company.entities.SelectionQuestion;
import com.company.entities.TextQuestion;
import com.company.strategy.PonderatedBehaviour;
import com.company.strategy.SelectionBehaviour;
import com.company.strategy.TextBehaviour;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Question> originals;

    public static void main(String[] args) {
	    System.out.println("Viam si xuta");

        originals = new ArrayList<Question>();
        originals.add(new TextQuestion("q1", 20, new TextBehaviour()));
        originals.add(new SelectionQuestion("q2", new SelectionBehaviour()));
        originals.add(new PonderatedQuestion("q3", new PonderatedBehaviour()));

	    List<Question> questions = new ArrayList<Question>();
	    questions.add(new TextQuestion("q1", 20, new TextBehaviour()));
        questions.add(new SelectionQuestion("q2", new SelectionBehaviour()));
        questions.add(new PonderatedQuestion("q3", new PonderatedBehaviour()));

        questions.forEach(q -> {
            originals.forEach(qo -> {
                q.validate(qo);
            });
        });

    }
}
