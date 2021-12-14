package io.genetv.rockpaperscissors.game;

import io.genetv.rockpaperscissors.R;

public enum GameOutcome {

    VICTORY(R.string.str_outcome_victory),
    DEFEAT(R.string.str_outcome_defeat),
    DRAW(R.string.str_outcome_draw);

    private int stringId;

    GameOutcome(int stringId) {
        this.stringId = stringId;
    }

}
