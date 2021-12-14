package io.genetv.rockpaperscissors.serivce;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

public class MultiplayerService {

    private MultiplayerService instance;
    private BluetoothAdapter bluetoothAdapter;

    private MultiplayerService() {
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    }

    public MultiplayerService getInstance() {
        if(instance == null)
            instance = new MultiplayerService();
        return instance;
    }

    public void startOpponentSearch() {

    }

    public void pairDevice(BluetoothDevice device) {
        
    }
}
