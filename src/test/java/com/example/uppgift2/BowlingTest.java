package com.example.uppgift2;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingTest {

    Bowling bowling = new Bowling();

    @Test
    @DisplayName("Given 0-0 when the game has not started")
    void given0WhenTheGameHasNotStarted() {
        assertThat(bowling.score()).isEqualTo("0-0");
    }

    @Test
    @DisplayName("Given 1-0 when player one knock down one pin")
    void given1WhenPlayerOneKnockDownOnePin() {
        bowling.knockDownPinOnePlayer=1;
        bowling.playerOneScore();
        assertThat(bowling.score()).isEqualTo("1-0");
    }

    @Test
    @DisplayName("Given 5-5 when the players have 5 score ")
    void given55WhenThePlayersHave5Score() {
        bowling.knockDownPinOnePlayer = 5;
        bowling.knockDownPinTwoPlayer = 5;
        bowling.playerOneScore();
        bowling.playerTwoScore();
        assertThat(bowling.score()).isEqualTo("5-5");
    }


}
