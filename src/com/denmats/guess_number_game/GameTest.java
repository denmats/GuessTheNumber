package com.denmats.guess_number_game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GameTest {

    Game game;

    @Test
    public void checkFeedbackIfTheGuessIsEqualToTheSecret(){
        game = new Game(4,4);
        assertEquals(Feedback.THE_GAME_IS_OVER,game.playGame());
    }

    @Test
    public void checkFeedbackIfTheGuessIsGreaterThanSecret(){
        game = new Game(4,1);
        assertEquals(Feedback.TOO_HIGH,game.playGame());
    }

    @Test
    public void checkFeedbackIfTheGuessIsLessThanTheSecret(){
        game = new Game(2,4);
        assertEquals(Feedback.TOO_LOW,game.playGame());
    }
}