package io.genetv.rockpaperscissors.controller;

import io.genetv.rockpaperscissors.serivce.IGameService;
import io.genetv.rockpaperscissors.serivce.MultiplayerService;
import io.genetv.rockpaperscissors.serivce.SingleplayerService;

public class GameController {

    private IGameService gameService;

    public GameController(boolean isMultiplayer) {
        gameService = isMultiplayer ? new MultiplayerService() : new SingleplayerService();
    }
}
