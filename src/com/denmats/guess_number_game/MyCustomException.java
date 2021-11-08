package com.denmats.guess_number_game;

public class MyCustomException extends Throwable {
    public String toString(){
        return "My exception occurred: Wrong input. Expected an integer number being provided";
    }
}
