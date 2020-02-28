package com.lgh.uvccamera.callback;

/**
 * <pre>
 *     @author : liudongbing
 *     @e-mail : lvdongbing@orbbec.com
 *     @time   : 2020/2/28
 *     @desc   : 预览回调接口
 *     version: 1.0
 * </pre>
 */
public interface PreviewCallback {
    /**
     * 预览流回调
     *
     * @param yuv yuv格式的数据流
     */
    void onPreviewFrame(byte[] yuv);
}
