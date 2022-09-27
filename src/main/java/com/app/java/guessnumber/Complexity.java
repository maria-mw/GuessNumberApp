package com.app.java.guessnumber;

import java.util.Objects;

public class Complexity {
    int attemptsAmount;
    int numberRange;

    public Complexity(int attemptsAmount, int numberRange) {
        this.attemptsAmount = attemptsAmount;
        this.numberRange = numberRange;
    }

//    public int getAttemptsAmount() {
//        return attemptsAmount;
//    }
//
//    public void setAttemptsAmount(int attemptsAmount) {
//        this.attemptsAmount = attemptsAmount;
//    }
//
//    public int getNumberRange() {
//        return numberRange;
//    }
//
//    public void setNumberRange(int numberRange) {
//        this.numberRange = numberRange;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complexity that = (Complexity) o;
        return attemptsAmount == that.attemptsAmount && numberRange == that.numberRange;
    }

    @Override
    public int hashCode() {
        return Objects.hash(attemptsAmount, numberRange);
    }
}
