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
        rollInFrameNumber(knockDownPinPlayer);
        knockDownPinPlayer = bonusCalculation(knockDownPinPlayer);
        sumScore(knockDownPinPlayer);
        givenABonus();
        resetRollInFrame();
        bonusInFrame10();
    }


    private int bonusCalculation(int knockDownPinPlayer) {
        if (spare) {
            knockDownPinPlayer *= 2;
            spare = false;
        } else if (strike) {
            knockDownPinPlayer *= 2;
            if (rollInFrame == 2) strike = false;
        }
        return knockDownPinPlayer;
    }


    private void bonusInFrame10() {
        if ((spare || strike) && frame == 9) {
            strike = false;
            spare = false;
            rollInFrame=-1;
        }
    }

    private void resetRollInFrame() {
        if (rollInFrame == 2) {
            rollInFrame = 0;
            rollInFrame1 = 0;
            rollInFrame2 = 0;
            frame++;
            if(frame==10){
                endGame=true;
                System.out.println("END GAME");
                frame=0;
            }
        }
    }

    private void givenABonus() {
        if (rollInFrame1 == 10 && rollInFrame == 1) {
            strike = true;
            rollInFrame = 2;
            onFrame = false;

        } else if (rollInFrame1 + rollInFrame2 == 10) {
            spare = true;
        }
    }

    private void sumScore(int knockDownPinPlayer) {
        score = knockDownPinPlayer + score;
        playerScore = score;
    }

    private void rollInFrameNumber(int knockDownPinPlayer) {
        if (!onFrame) {
            rollInFrame1 = knockDownPinPlayer;
            onFrame = true;
        } else {
            rollInFrame2 = knockDownPinPlayer;
            onFrame = false;
        }
    }
}

