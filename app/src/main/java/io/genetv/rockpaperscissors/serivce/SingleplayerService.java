package io.genetv.rockpaperscissors.serivce;

import io.genetv.rockpaperscissors.game.GameMove;
import io.genetv.rockpaperscissors.game.GameState;
import io.genetv.rockpaperscissors.game.Match;
import io.genetv.rockpaperscissors.serivce.IGameService;

public class SingleplayerService implements IGameService {

    @Override
    public void makeMove(GameMove move) {
        Match match = Match.getInstance();
        if(match.getGameState() != GameState.IN_GAME) return;

        match.setMoveSelf(move);

        // TODO: Make AI move
    }
}
