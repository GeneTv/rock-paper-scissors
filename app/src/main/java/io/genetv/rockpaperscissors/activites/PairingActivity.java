package io.genetv.rockpaperscissors.activites;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.UUID;

import io.genetv.rockpaperscissors.R;

public class PairingActivity extends AppCompatActivity {

    private Button btnCancel;
    private BluetoothAdapter bluetoothAdapter;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pairing);

        btnCancel = findViewById(R.id.btn_cancel);
        btnCancel.setOnClickListener( btn -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        // FIXME: Fuck it, ship it solution
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        if(!bluetoothAdapter.isEnabled()) {
            bluetoothAdapter.enable();
        }

        if(!bluetoothAdapter.isDiscovering()) {

            Intent discorveryIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
            startActivity(discorveryIntent);

            bluetoothAdapter.startDiscovery();
            bluetoothAdapter.setName("Player " + UUID.randomUUID().toString());
        }

        Toast.makeText(this, "Searching for player...", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        switch (requestCode) {
            case REQUEST:
                break;

            case 323:
                break;

            case 3483:
                break;
        }
    }
}