package io.genetv.rockpaperscissors.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.Button;

import androidx.annotation.RequiresApi;

import io.genetv.rockpaperscissors.activites.GameOverActivity;
import io.genetv.rockpaperscissors.game.GameMove;
import io.genetv.rockpaperscissors.game.GameOutcome;
import io.genetv.rockpaperscissors.game.Match;
import io.genetv.rockpaperscissors.serivce.IGameService;
import io.genetv.rockpaperscissors.serivce.MultiplayerService;
import io.genetv.rockpaperscissors.serivce.SingleplayerService;

public class GameController {

    private final IGameService gameService;

    public GameController(boolean isMultiplayer) {
        gameService = isMultiplayer ? new MultiplayerService() : new SingleplayerService();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void clickGameMoveButton(Button button, Context context) {
        GameMove move = GameMove.getByButtonId(button.getId());

        GameOutcome outcome = gameService.makeMove(move);
        if(outcome != null) {
            // Transition to the "game over" view... Game is over since both outcomes are known
            Match match = Match.getInstance();

            Intent intentGameOver = new Intent(context, GameOverActivity.class);
            intentGameOver.putExtra("outcome", outcome);
            intentGameOver.putExtra("moveSelf", match.getMoveSelf());
            intentGameOver.putExtra("moveOpponent", match.getMoveOpponent());

            context.startActivity(intentGameOver);
        }

    }
}
