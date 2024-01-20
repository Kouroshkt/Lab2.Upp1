package com.example.uppgift2;

public class Bowling {
    int pOneScore;
    int pTwoScore;

    public String score() {
        return pOneScore + "-" + pTwoScore;
    }

    public void playerOneScore() {
        pOneScore++;
    }

    public void playerTwoScore() {
        pTwoScore++;
    }
}
