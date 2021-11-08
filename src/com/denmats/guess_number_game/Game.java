package com.denmats.guess_number_game;

import java.util.Random;
import java.util.Scanner;

public class Game {

    final int secretNumber;
    private int guess;
    private boolean isGameContinue;

    Game(int minNumber, int maxNumber) {
        this.secretNumber = getRandomNumberFromTheGivenRange(minNumber, maxNumber);
        this.isGameContinue = true;
        this.guess = 0;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getGuess(){
        return guess;
    }

    public void displayTheGameResult() throws MyCustomException {
        playGame();
        System.out.println("You won! The guessed number was " + this.secretNumber);
    }

    protected void playGame() throws MyCustomException {
        while (isGameContinue) {
            makeAGuess();
            checkIfTheGameOverOrGiveAFeedback();
        }
    }

    private void checkIfTheGameOverOrGiveAFeedback() {
        if (isTheSecretNumberGuessed()) {
            isGameContinue = false;
        } else {
            giveAFeedback();
        }
    }

    private void giveAFeedback() {
        Feedback feedback;
        if (isTheGuessGreaterThanTheSecretNumber()) {
            feedback = Feedback.HIGH;
        } else {
            feedback = Feedback.LOW;
        }
        System.out.println(feedback.getFeedback());
    }

    private boolean isTheGuessGreaterThanTheSecretNumber() {
        return this.guess > this.secretNumber;
    }


    private boolean isTheSecretNumberGuessed() {
        return this.guess == this.secretNumber;
    }


    /*protected void makeAGuess() {
        System.out.println("Make a guess what is the secret number?");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            this.guess = scanner.nextInt();
        }
    }*/

    //The above function commented has to be rewritten for testing purposes with split into two functions
    public void makeAGuess() throws MyCustomException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make a guess what is the secret number? ");
        validateUserInput(scanner.next());
    }

    protected void validateUserInput(String input) throws MyCustomException {
        try {
            this.guess = Integer.parseInt(input);
            checkIfTheGuessNumberIsWithinTheRange1To100();
        } catch (NumberFormatException e) {
            throw new MyCustomException();
        }
    }

    protected void checkIfTheGuessNumberIsWithinTheRange1To100() {
        if(this.guess < 1 || this.guess > 100){
            this.guess = -1;
            System.out.println("Wrong input! The guess must fit the range from 1 to 100 inclusively");
        }
    }


    private static int getRandomNumberFromTheGivenRange(int min, int max) {
        if (min > max) {
            int temp = max;
            max = min;
            min = temp;
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
