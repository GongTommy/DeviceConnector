package com.sjl.deviceconnector.listener;

import android.bluetooth.BluetoothDevice;

/**
 * 蓝牙扫描监听
 *
 * @author Kelly
 * @version 1.0.0
 * @filename BluetoothScanListener
 * @time 2022/8/4 16:26
 * @copyright(C) 2022 song
 */
public interface BluetoothScanListener {
    void onDeviceFound(BluetoothDevice bluetoothDevice);

    void onScanFinish();

}
