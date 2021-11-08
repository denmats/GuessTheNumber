package com.denmats.guess_number_game;

public enum Feedback {

    HIGH("Too High!"),
    LOW("Too Low!");

    private final String feedback;


    Feedback(String feedback) {
        this.feedback = feedback;
    }

    public String getFeedback(){
        return this.feedback;
    }
}
