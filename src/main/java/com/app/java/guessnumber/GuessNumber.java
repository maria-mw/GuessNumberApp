package com.app.java.guessnumber;

import java.util.HashMap;
import java.util.Map;

public class GuessNumber {
    Map<String,Complexity> complexity = new HashMap<>();

    public GuessNumber() {
        complexity.put("EASY", new Complexity(4,10));
        complexity.put("MEDIUM", new Complexity(5,100));
        complexity.put("HARD", new Complexity(7, 1000));
    }

//    public void addComplexity(String name, int attemptsAmount, int numberRange) {
//        complexity.put(name,new Complexity(attemptsAmount,numberRange));
//    }

}
