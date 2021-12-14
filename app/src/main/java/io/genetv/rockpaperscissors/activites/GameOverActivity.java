package io.genetv.rockpaperscissors.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import io.genetv.rockpaperscissors.R;
import io.genetv.rockpaperscissors.game.GameMove;
import io.genetv.rockpaperscissors.game.GameOutcome;

public class GameOverActivity extends AppCompatActivity {

    private TextView textViewGameOutcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        textViewGameOutcome = findViewById(R.id.text_game_over);

        GameOutcome gameOutcome = (GameOutcome) getIntent().getExtras().get("outcome");
        GameMove moveSelf = (GameMove) getIntent().getExtras().get("moveSelf");
        GameMove moveOpponent = (GameMove) getIntent().getExtras().get("moveOpponent");

        String strMoveOutcome = getResources().getString(gameOutcome.getStringId());

        String strOutcome = String.format(getResources().getString(R.string.str_outcome_text),
                moveSelf.name(), strMoveOutcome, moveOpponent.name());
        textViewGameOutcome.setText(strOutcome);
    }

    @Override
    public void onBackPressed() {
        return;
    }
}