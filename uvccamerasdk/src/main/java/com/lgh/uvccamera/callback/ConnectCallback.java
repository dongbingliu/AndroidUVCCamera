package com.lgh.uvccamera.callback;

import android.hardware.usb.UsbDevice;

/**
 * <pre>
 *     @author : liudongbing
 *     @e-mail : lvdongbing@orbbec.com
 *     @time   : 2020/2/28
 *     @desc   : USB连接监听接口
 *     version: 1.0
 * </pre>
 */
public interface ConnectCallback {
    /**
     * 插入设备
     *
     * @param usbDevice
     */
    void onAttached(UsbDevice usbDevice);

    /**
     * USB设备授权回调
     *
     * @param usbDevice
     * @param granted   是否授权成功
     */
    void onGranted(UsbDevice usbDevice, boolean granted);

    /**
     * 设备连接成功
     *
     * @param usbDevice
     */
    void onConnected(UsbDevice usbDevice);

    /**
     * 相机打开成功
     */
    void onCameraOpened();

    /**
     * 设备拔出
     *
     * @param usbDevice
     */
    void onDetached(UsbDevice usbDevice);

}
