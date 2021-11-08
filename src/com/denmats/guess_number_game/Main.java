package com.denmats.guess_number_game;

public class Main {

    public static void main(String[] args) throws MyCustomException {
        Game game = new Game(1,100);
        game.displayTheGameResult();
    }
}
