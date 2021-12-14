package io.genetv.rockpaperscissors.game;

import java.lang.reflect.Array;
import java.util.UUID;

public class Match {

    private static Match instance;
    private GameState gameState;

    private GameMove moveSelf;
    private GameMove moveOpponent;

    private Match() {
        this.gameState = GameState.PRE_GAME;
        this.moveSelf = null;
        this.moveOpponent = null;
    }

    public static Match getInstance() {
        if(instance == null)
            instance = new Match();
        return instance;
    }

    public GameState getGameState() {
        return gameState;
    }

    public GameMove getMoveOpponent() {
        return moveOpponent;
    }

    public GameMove getMoveSelf() {
        return moveSelf;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public void setMoveOpponent(GameMove moveOpponent) {
        this.moveOpponent = moveOpponent;
    }

    public void setMoveSelf(GameMove moveSelf) {
        this.moveSelf = moveSelf;
    }
}
