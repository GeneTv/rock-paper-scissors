package io.genetv.rockpaperscissors.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.genetv.rockpaperscissors.R;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        boolean isComputerMatch = getIntent().getExtras().getBoolean("isComputerMatch");
        if(isComputerMatch) {
            System.out.println("Match vs AI");
        }
    }
}