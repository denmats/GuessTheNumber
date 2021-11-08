package com.denmats.guess_number_game;

import java.util.Random;

public class SecretNumberGenerator {

    protected static int getRandomNumberFromTheGivenRange(int min, int max) {
        if (min > max) {
            int temp = max;
            max = min;
            min = temp;
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
