package com.denmats.guess_number_game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeedbackTest {

    @Test
    public void givenFeedback_whenTheGuessGreaterThanTheSecretNumber() {
        Feedback feedback = Feedback.HIGH;
        assertEquals("Too High!",feedback.getFeedback());
    }

    @Test
    public void givenFeedback_whenTheGuessLessThanTheSecretNumber() {
        Feedback feedback = Feedback.LOW;
        assertEquals("Too Low!",feedback.getFeedback());
    }

}