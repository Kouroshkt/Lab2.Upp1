package com.example.uppgift2;

public class Bowling {
    int playerScore;
    int knockDownPinPlayer;
    int score;
    boolean spare;
    boolean strike;
    int rollInFrame;


    public int score() {
        return playerScore;
    }

    public void roll(int knockDownPinPlayer) {
        rollInFrame++;
        score = knockDownPinPlayer + score;
        playerScore = score;
        if (score == 10 && rollInFrame == 1) strike = true;
        if (score == 10 && rollInFrame == 2) spare = true;
    }

}

