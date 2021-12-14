package io.genetv.rockpaperscissors.game;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;

import io.genetv.rockpaperscissors.R;

public enum GameMove {
    ROCK("Rock", R.id.btn_play_rock, "SCISSOR"),
    PAPER("Paper", R.id.btn_play_paper, "ROCK"),
    SCISSOR("Scissor", R.id.btn_play_scissor, "PAPER");

    private String name;
    private int buttonId;
    private String winsAgainst; // String reference is used to prevent forward reference error

    GameMove(String name, int buttonId, String winsAgainst) {
        this.name = name;
        this.buttonId = buttonId;
        this.winsAgainst = winsAgainst;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static GameMove getByButtonId(int buttonId) {
        return Arrays.stream(GameMove.values()).filter( gameMove -> gameMove.buttonId == buttonId).findFirst().get();
    }

    public GameMove winsAgainst() {
        return GameMove.valueOf(winsAgainst);
    }
}
