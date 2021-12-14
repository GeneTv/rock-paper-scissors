package io.genetv.rockpaperscissors.activites;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import io.genetv.rockpaperscissors.R;
import io.genetv.rockpaperscissors.controller.GameController;

public class GameActivity extends AppCompatActivity {

    private GameController gameController;
    private Button btnPlayRock;
    private Button btnPlayPaper;
    private Button btnPlayScissor;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        boolean isComputerMatch = getIntent().getExtras().getBoolean("isComputerMatch");
        gameController = new GameController(!isComputerMatch);

        btnPlayRock = findViewById(R.id.btn_play_rock);
        btnPlayPaper = findViewById(R.id.btn_play_paper);
        btnPlayScissor = findViewById(R.id.btn_play_scissor);

        btnPlayRock.setOnClickListener(btn -> gameController.clickGameMoveButton((Button)btn, this));
        btnPlayPaper.setOnClickListener(btn -> gameController.clickGameMoveButton((Button)btn, this));
        btnPlayScissor.setOnClickListener(btn -> gameController.clickGameMoveButton((Button)btn, this));

    }

    @Override
    public void onBackPressed() {
        return;
    }
}