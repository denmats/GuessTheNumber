package com.denmats.guess_number_game;

public class Main {

    public static void main(String[] args) throws MyCustomException {

        final int secret = SecretNumberGenerator.getRandomNumberFromTheGivenRange(1,100);
        boolean isGame = true;

        while (isGame) {
            int guess = UserInterface.makeAGuess();

            System.out.println(new Game(guess, secret).playGame());
            isGame = checkIfTheGameIsOver(guess, secret);
        }
    }

    private static boolean checkIfTheGameIsOver(int secret, int guess) {
        boolean isGame = true;
        if(guess == secret){
            System.out.println("The secret number was "+ secret);
            isGame = false;
        }
        return isGame;
    }
}
