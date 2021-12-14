package io.genetv.rockpaperscissors.server;

import android.bluetooth.BluetoothDevice;

public class BluetoothAdapter {

    private BluetoothAdapter instance;
    private android.bluetooth.BluetoothAdapter bluetoothAdapter;

    private BluetoothAdapter() {
        bluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    }

    public BluetoothAdapter getInstance() {
        if(instance == null)
            instance = new BluetoothAdapter();
        return instance;
    }

    public void startOpponentSearch() {

    }

    public void pairDevice(BluetoothDevice device) {

    }

}
