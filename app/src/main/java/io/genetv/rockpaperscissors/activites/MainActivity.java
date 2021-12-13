package io.genetv.rockpaperscissors.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import io.genetv.rockpaperscissors.R;
import io.genetv.rockpaperscissors.game.GameMove;

public class MainActivity extends AppCompatActivity {

    private Button btnGameSearch;
    private Button btnGameComputer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnGameSearch = findViewById(R.id.btn_game_search);
        this.btnGameComputer = findViewById(R.id.btn_game_computer);

        btnGameSearch.setOnClickListener( btn -> {
            Intent intent = new Intent(this, PairingActivity.class);
            startActivity(intent);
        });

        btnGameComputer.setOnClickListener( btn -> {
            Intent intent = new Intent(this, GameActivity.class);
            intent.putExtra("isComputerMatch", true);
            startActivity(intent);
        });
    }
}