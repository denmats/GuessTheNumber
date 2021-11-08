package com.denmats.guess_number_game;

import java.util.Scanner;

public class UserInterface {
    private static final Scanner scanner = new Scanner(System.in);

    public static int makeAGuess() throws MyCustomException {
        System.out.println("Make a guess what is the secret number? ");
        return validateUserInput(scanner.next());
    }

    protected static int validateUserInput(String input) throws MyCustomException {
        int guess;
        try {
            guess = Integer.parseInt(input);
            checkIfTheGuessNumberIsWithinTheRange1To100(guess);
        } catch (NumberFormatException e) {
            throw new MyCustomException();
        }
        return guess;
    }

    protected static void checkIfTheGuessNumberIsWithinTheRange1To100(int guess) {
        if (guess < 1 || guess > 100) {
            System.out.println("The guess must fit the range from 1 to 100 inclusively!");
        }
    }
}
