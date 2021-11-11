package com.denmats.guess_number_game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void checkIfTheGameIsOver_GuessIsNotEqualToSecret(){
        final boolean isGame = Main.checkIfTheGameIsOver(3, 23);
        assertTrue(isGame, "The game is not over");
    }

    @Test
    public void checkIfTheGameIsOver_GuessIsEqualToSecret(){
        final boolean isGame = Main.checkIfTheGameIsOver(23, 23);
        assertFalse(isGame, "The game is over");
    }
}