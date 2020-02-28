package com.lgh.uvccamera.usb;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;

/**
 * <pre>
 *     @author : liudongbing
 *     @e-mail : lvdongbing@orbbec.com
 *     @time   : 2020/2/28
 *     @desc   : usb插拔监听实现接口
 *     version: 1.0
 * </pre>
 */
public interface IMonitor {
    void registerReceiver();

    void unregisterReceiver();

    void checkDevice();

    void requestPermission(UsbDevice usbDevice);

    void connectDevice(UsbDevice usbDevice);

    void closeDevice();

    UsbController getUsbController();

    UsbDeviceConnection getConnection();
}
