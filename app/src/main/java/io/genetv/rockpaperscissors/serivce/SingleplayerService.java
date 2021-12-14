package io.genetv.rockpaperscissors.serivce;

import io.genetv.rockpaperscissors.game.GameMove;

public class SingleplayerService implements IGameService {

    @Override
    public void makeMove(GameMove move) {
        System.out.println("You made the move: " + move.name());
        System.out.println("AI made the move:" + GameMove.values()[(int)Math.round(Math.random() * 2)].name());
    }
}
