package io.genetv.rockpaperscissors.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.genetv.rockpaperscissors.R;

public class GameOverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
    }

    @Override
    public void onBackPressed() {
        return;
    }
}