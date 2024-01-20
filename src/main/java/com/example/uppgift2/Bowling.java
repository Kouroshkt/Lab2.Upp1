package com.example.uppgift2;

public class Bowling {
    int playerScore;
    int knockDownPinPlayer;


    public int score() {
        return playerScore;
    }

    public void playerOneScore() {
        for (int i = 0; i < knockDownPinPlayer; i++) {
            playerScore++;
        }
    }

}
