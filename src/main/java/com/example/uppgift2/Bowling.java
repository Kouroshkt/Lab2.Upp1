package com.example.uppgift2;

public class Bowling {
    int playerScore;
    int knockDownPinPlayer;
    int score;
    boolean spare;


    public int score() {
        return playerScore;
    }

    public void roll(int knockDownPinPlayer) {
        score=knockDownPinPlayer+score;
        playerScore = score;
        if (score==10) spare=true;
    }

}

