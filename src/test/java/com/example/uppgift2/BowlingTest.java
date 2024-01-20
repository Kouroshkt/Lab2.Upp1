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
        bowling.roll(1);
        assertThat(bowling.score()).isEqualTo(1);
    }

    @Test
    @DisplayName("Given 5 when the player knock down five pin")
    void given5WhenThePlayerHave5Score() {
        bowling.roll(5);
        assertThat(bowling.score()).isEqualTo(5);
    }

    @Test
    @DisplayName("Given 8 score after two rolls")
    void given15ScoreAfterTwoFrames() {
        bowling.roll(6);
        bowling.roll(2);
        assertThat(bowling.score()).isEqualTo(8);
    }

    @Test
    @DisplayName("Given a spare when have 10 score on two rolls in a frame")
    void givenASpareWhenHave10ScoreOnTwoRolls() {
        bowling.roll(4);
        bowling.roll(6);
        assertThat(bowling.spare).isTrue();
    }

    @Test
    @DisplayName("Given a strike when have 10 score on first roll in a frame")
    void givenAStrikeWhenHave10ScoreOnFirstRollInAFrame() {
        bowling.roll(10);
        assertThat(bowling.strike).isTrue();
    }

    @Test
    @DisplayName("Should given 20 if roll_1=5 roll_2=5 roll_3=5")
    void shouldGiven20IfHaveSpareBonusOnThirdRollInFrameNumberTwo() {
        bowling.roll(5);
        bowling.roll(5);
        bowling.roll(5);
        assertThat(bowling.score()).isEqualTo(20);
    }

    @Test
    @DisplayName("Should given 24 if roll_1=10 roll_2=5 roll_3=2")
    void shouldGiven24IfRoll110Roll25Roll32() {
        bowling.roll(10);
        bowling.roll(5);
        bowling.roll(2);
        assertThat(bowling.score()).isEqualTo(24);
    }

    @Test
    @DisplayName("should given 44 after 6 roll")
    void shouldGiven44After6Roll() {
        bowling.roll(10);
        bowling.roll(5);
        bowling.roll(2);
        bowling.roll(5);
        bowling.roll(5);
        bowling.roll(5);
        assertThat(bowling.score()).isEqualTo(44);
    }


}
