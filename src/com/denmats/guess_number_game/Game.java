package com.denmats.guess_number_game;

public class Game {

    final private int secret;
    final private int guess;

    public Game(int guess, int secret){
        this.secret = secret;
        this.guess = guess;
    }

    public Feedback playGame(){
        Feedback feedback = Feedback.THE_GAME_IS_OVER;

        if(this.guess > this.secret){
            feedback = Feedback.TOO_HIGH;
        }

        if(this.guess < this.secret){
            feedback = Feedback.TOO_LOW;
        }

        return feedback;
    }
}
