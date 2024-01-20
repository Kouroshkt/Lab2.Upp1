package com.example.uppgift2;

public class Bowling {
    int playerScore;
    int score;
    boolean spare;
    boolean strike;
    int rollInFrame;
    boolean onFrame;
    int frame;
    int rollInFrame1;
    int rollInFrame2;
    boolean endGame;


    public int score() {
        return playerScore;
    }

    public void roll(int knockDownPinPlayer) {
        rollInFrame++;
        if (!onFrame) {
            rollInFrame1 = knockDownPinPlayer;
            onFrame = true;
        } else {
            rollInFrame2 = knockDownPinPlayer;
            onFrame = false;
        }
        if (spare) {
            knockDownPinPlayer *= 2;
            spare = false;
        } else if (strike) {
            knockDownPinPlayer *= 2;
            if (rollInFrame == 2) strike = false;
        }
        score = knockDownPinPlayer + score;
        playerScore = score;

        if (rollInFrame1 == 10 && rollInFrame == 1) {
            strike = true;
            rollInFrame = 2;
            onFrame = false;

        } else if (rollInFrame1 + rollInFrame2 == 10) {
            spare = true;
        }
        if (rollInFrame == 2) {
            rollInFrame = 0;
            rollInFrame1 = 0;
            rollInFrame2 = 0;
            frame++;
            if(frame==10)endGame=true;
        }
        if ((spare || strike) && frame == 9) {
            strike = false;
            spare = false;
            rollInFrame=-1;
        }
    }
}

