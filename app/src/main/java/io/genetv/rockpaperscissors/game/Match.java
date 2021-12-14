package io.genetv.rockpaperscissors.game;

import java.lang.reflect.Array;
import java.util.UUID;

public class Match {

    private static Match instance;

    private GameMove moveSelf;
    private GameMove moveOpponent;

    private Match() {
        this.moveSelf = null;
        this.moveOpponent = null;
    }

    public static Match getInstance() {
        if(instance == null)
            instance = new Match();
        return instance;
    }

    public GameMove getMoveOpponent() {
        return moveOpponent;
    }

    public GameMove getMoveSelf() {
        return moveSelf;
    }

    public void setMoveOpponent(GameMove moveOpponent) {
        this.moveOpponent = moveOpponent;
    }

    public void setMoveSelf(GameMove moveSelf) {
        this.moveSelf = moveSelf;
    }

    public GameOutcome getOutcome() {
        if(moveSelf == moveOpponent) return GameOutcome.DRAW;

        // !! WARNING !! Very bad code :(
        if(moveSelf == GameMove.ROCK && moveOpponent == GameMove.SCISSOR ||
                moveSelf == GameMove.PAPER && moveOpponent == GameMove.ROCK ||
                moveSelf == GameMove.SCISSOR && moveOpponent == GameMove.PAPER
        ) return GameOutcome.VICTORY;

        return GameOutcome.DEFEAT;
    }

    public void reset() {
        instance = new Match();
    }
}
