package io.genetv.rockpaperscissors.serivce;

import android.content.Intent;

import io.genetv.rockpaperscissors.activites.GameActivity;
import io.genetv.rockpaperscissors.activites.GameOverActivity;
import io.genetv.rockpaperscissors.game.GameMove;
import io.genetv.rockpaperscissors.game.Match;

public class SingleplayerService implements IGameService {

    @Override
    public void makeMove(GameMove move) {
        Match match = Match.getInstance();
        GameMove moveComputer = GameMove.values()[(int)Math.round(Math.random() * 2)];

        match.setMoveSelf(move);
        match.setMoveOpponent(moveComputer);

        //Intent intentGameOver = new Intent(GameActivity.class, GameOverActivity.class);

        //String.format(getString())
        System.out.println(moveComputer.name());
        System.out.println(match.getOutcome().name());
    }
}
