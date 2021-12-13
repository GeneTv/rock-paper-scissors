package io.genetv.rockpaperscissors.game;

public class Player {

    private GameMove gameMove;

    public Player() {
        gameMove = null;
    }

    public void makeMove(GameMove gameMove) {
        this.gameMove = gameMove;
    }

    public boolean hasMadeMove() {
        return gameMove != null;
    }
    public GameMove getGameMove() {
        return gameMove;
    }
}
