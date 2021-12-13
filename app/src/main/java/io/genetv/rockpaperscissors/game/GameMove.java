package io.genetv.rockpaperscissors.game;

public enum GameMove {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private String name;

    GameMove(String name) {
        this.name = name;
    }
}
