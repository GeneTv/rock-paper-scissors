package io.genetv.rockpaperscissors.controller;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

public class BluetoothController {

    private BluetoothController instance;
    private BluetoothAdapter bluetoothAdapter;

    private BluetoothController() {
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    }

    public BluetoothController getInstance() {
        if(instance == null)
            instance = new BluetoothController();
        return instance;
    }

    public void startOpponentSearch() {

    }

    public void pairDevice(BluetoothDevice device) {

    }

}
