package com.example.uppgift2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingTest {

    Bowling bowling = new Bowling();

    @Test
    @DisplayName("Given 0 when the game has not started")
    void given0WhenTheGameHasNotStarted() {
        assertThat(bowling.score()).isEqualTo(0);
    }

    @Test
    @DisplayName("Given 1 when the player knock down one pin")
    void given1WhenPlayerKnockDownOnePin() {
        bowling.knockDownPinPlayer =1;
        bowling.playerOneScore();
        assertThat(bowling.score()).isEqualTo(1);
    }

    @Test
    @DisplayName("Given 5 when the player knock down five pin")
    void given5WhenThePlayerHave5Score() {
        bowling.knockDownPinPlayer = 5;
        bowling.playerOneScore();
        assertThat(bowling.score()).isEqualTo(5);
    }


}
