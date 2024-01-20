package com.example.uppgift2;

public class Bowling {
    int playerScore;
    int score;
    boolean spare;
    boolean strike;
    int rollInFrame;
    int frame;


    public int score() {
        return playerScore;
    }

    public void roll(int knockDownPinPlayer) {
        rollInFrame++;
        if(spare) knockDownPinPlayer*=2;
        score = knockDownPinPlayer + score;
        playerScore = score;

        if (score == 10 && rollInFrame == 1) {
            strike = true;
            rollInFrame = 0;
            frame++;

        } else if (score == 10 && rollInFrame == 2) {
            spare = true;
            rollInFrame = 0;
            frame++;
        }
    }

}

