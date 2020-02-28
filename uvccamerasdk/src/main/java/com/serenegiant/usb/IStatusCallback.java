package com.serenegiant.usb;

import java.nio.ByteBuffer;
/**
 * <pre>
 *     @author : liudongbing
 *     @e-mail : lvdongbing@orbbec.com
 *     @time   : 2020/2/28
 *     @desc   : 
 *     version: 1.0
 * </pre>
 */
public interface IStatusCallback {
    void onStatus(int statusClass, int event, int selector, int statusAttribute, ByteBuffer data);
}
