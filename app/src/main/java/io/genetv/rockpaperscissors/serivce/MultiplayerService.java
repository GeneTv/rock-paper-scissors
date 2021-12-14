package io.genetv.rockpaperscissors.serivce;

import io.genetv.rockpaperscissors.game.GameMove;

public class MultiplayerService implements IGameService {

    @Override
    public void makeMove(GameMove move) {
        /* TODO:
            -> Send my move to the opponent device (save it there)
            -> Save my move to the match object
            if(match.getOutcome() != null)
                Transition to the game over view... Game is over since both outcomes are known
         */

    }
}
