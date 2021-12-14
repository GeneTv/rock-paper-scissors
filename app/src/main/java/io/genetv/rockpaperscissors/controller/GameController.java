package io.genetv.rockpaperscissors.controller;

import android.content.Intent;
import android.os.Build;
import android.widget.Button;

import androidx.annotation.RequiresApi;

import io.genetv.rockpaperscissors.activites.GameActivity;
import io.genetv.rockpaperscissors.game.GameMove;
import io.genetv.rockpaperscissors.serivce.IGameService;
import io.genetv.rockpaperscissors.serivce.MultiplayerService;
import io.genetv.rockpaperscissors.serivce.SingleplayerService;

public class GameController {

    private IGameService gameService;

    public GameController(boolean isMultiplayer) {
        gameService = isMultiplayer ? new MultiplayerService() : new SingleplayerService();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void clickGameMoveButton(Button button) {
        GameMove move = GameMove.getByButtonId(button.getId());
        gameService.makeMove(move);
    }

    /*public String getOutcomeMessage() {
        return
    }*/
}
