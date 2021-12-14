package io.genetv.rockpaperscissors.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import io.genetv.rockpaperscissors.R;
import io.genetv.rockpaperscissors.controller.GameController;
import io.genetv.rockpaperscissors.game.GameMove;
import io.genetv.rockpaperscissors.game.GameOutcome;

public class GameOverActivity extends AppCompatActivity {

    private TextView textViewGameOutcome;
    private Button btnGameEnd;
    private Button btnGameRematch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        textViewGameOutcome = findViewById(R.id.text_game_over);
        btnGameEnd = findViewById(R.id.btn_game_end);
        btnGameRematch = findViewById(R.id.btn_game_rematch);

        GameOutcome gameOutcome = (GameOutcome) getIntent().getExtras().get("outcome");
        GameMove moveSelf = (GameMove) getIntent().getExtras().get("moveSelf");
        GameMove moveOpponent = (GameMove) getIntent().getExtras().get("moveOpponent");

        String strMoveOutcome = getResources().getString(gameOutcome.getStringId());
        String strOutcome = String.format(getResources().getString(R.string.str_outcome_text),
                moveSelf.name(), strMoveOutcome, moveOpponent.name());

        textViewGameOutcome.setText(strOutcome);
        textViewGameOutcome.setTextColor(getResources().getColor(gameOutcome.getTextColor()));

        btnGameEnd.setOnClickListener( btn -> {
            Intent intentGameEnd = new Intent(this, MainActivity.class);
            startActivity(intentGameEnd);
        });

        btnGameRematch.setOnClickListener( btn -> {

        });
    }

    @Override
    public void onBackPressed() {
        return;
    }
}