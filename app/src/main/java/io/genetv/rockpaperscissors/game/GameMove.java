package io.genetv.rockpaperscissors.game;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;

import io.genetv.rockpaperscissors.R;

public enum GameMove {
    ROCK("Rock", R.id.btn_play_rock),
    PAPER("Paper", R.id.btn_play_paper),
    SCISSOR("Scissor", R.id.btn_play_scissor);

    private String name;
    private int buttonId;

    GameMove(String name, int buttonId) {
        this.name = name;
        this.buttonId = buttonId;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static GameMove getByButtonId(int buttonId) {
        return Arrays.stream(GameMove.values()).filter( gameMove -> gameMove.buttonId == buttonId).findFirst().get();
    }
}
