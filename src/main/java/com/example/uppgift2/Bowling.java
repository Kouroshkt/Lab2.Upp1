package com.example.uppgift2;

public class Bowling {
    int pOneScore;
    int pTwoScore;
    int knockDownPinOnePlayer;
    int knockDownPinTwoPlayer;


    public String score() {
        return pOneScore + "-" + pTwoScore;
    }

    public void playerOneScore() {
        for (int i = 0; i < knockDownPinOnePlayer; i++) {
            pOneScore++;
        }
    }

    public void playerTwoScore() {
        for (int i = 0; i < knockDownPinTwoPlayer; i++) {
            pTwoScore++;
        }
    }
}
