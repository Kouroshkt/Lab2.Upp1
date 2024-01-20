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



    public int score() {
        return playerScore;
    }

    public void roll(int knockDownPinPlayer) {
        rollInFrame++;
        if (!onFrame){
            rollInFrame1=knockDownPinPlayer;
            onFrame=true;
        }
        else if (onFrame){
            rollInFrame2=knockDownPinPlayer;
            onFrame=false;
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
            rollInFrame = 0;
            frame++;

        } else if (rollInFrame1+rollInFrame2 == 10 && rollInFrame == 2) {
            spare = true;
            rollInFrame = 0;
            frame++;
        }
    }

}

