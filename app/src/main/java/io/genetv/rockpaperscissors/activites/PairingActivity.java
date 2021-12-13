package io.genetv.rockpaperscissors.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import io.genetv.rockpaperscissors.R;

public class PairingActivity extends AppCompatActivity {

    private Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pairing);

        btnCancel = findViewById(R.id.btn_cancel);
        btnCancel.setOnClickListener( btn -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

    }
}