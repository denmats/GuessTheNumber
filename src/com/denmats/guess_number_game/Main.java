package com.denmats.guess_number_game;

public class Main {

    public static void main(String[] args) throws MyCustomException {

        int secret = SecretNumberGenerator.getRandomNumberFromTheGivenRange(1,100);
        boolean isGame = true;

        System.out.println("Secret is "+secret);

        while (isGame) {
            int guess = UserInterface.makeAGuess();
            Game game = new Game(guess, secret);
            System.out.println(game.playGame());
            if(game.getGuess() == game.getSecret()){
                System.out.println("The secret number was "+ secret);
                isGame = false;
            }
        }
    }
}
