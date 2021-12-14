package io.genetv.rockpaperscissors.serivce;

import io.genetv.rockpaperscissors.game.GameMove;
import io.genetv.rockpaperscissors.game.GameOutcome;

public interface IGameService {

    public GameOutcome makeMove(GameMove move);

}
