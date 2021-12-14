package io.genetv.rockpaperscissors.game;

import io.genetv.rockpaperscissors.R;

public enum GameOutcome {

    VICTORY(R.string.str_outcome_victory, R.color.victory),
    DEFEAT(R.string.str_outcome_defeat, R.color.defeat),
    DRAW(R.string.str_outcome_draw, R.color.draw);

    private int stringId;
    private int textColor;

    GameOutcome(int stringId, int textColor) {
        this.stringId = stringId;
        this.textColor = textColor;
    }

    public int getStringId() {
        return stringId;
    }

    public int getTextColor() {
        return textColor;
    }
}
