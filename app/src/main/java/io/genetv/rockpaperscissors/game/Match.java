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
        if(moveSelf == null || moveOpponent == null) return null;

        if(moveSelf.winsAgainst() == moveOpponent) return GameOutcome.VICTORY;
        if(moveSelf == moveOpponent.winsAgainst()) return GameOutcome.DEFEAT;
        return GameOutcome.DRAW;
    }

    public void reset() {
        instance = new Match();
    }
}
