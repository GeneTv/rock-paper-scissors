package io.genetv.rockpaperscissors.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import io.genetv.rockpaperscissors.R;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        boolean isComputerMatch = getIntent().getExtras().getBoolean("isComputerMatch");
        if(isComputerMatch) {
            Toast.makeText(this, R.string.text_info_match_computer_found, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed() {
        return;
    }
}