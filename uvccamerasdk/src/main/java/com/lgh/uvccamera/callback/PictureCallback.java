package com.lgh.uvccamera.callback;

/**
 * <pre>
 *     @author : liudongbing
 *     @e-mail : lvdongbing@orbbec.com
 *     @time   : 2020/2/28
 *     @desc   : 一般uvc相机用的拍照回调接口
 *     version: 1.0
 * </pre>
 */
public interface PictureCallback {
    /**
     * 拍照成功图片回调
     *
     * @param path 图片保存路径
     */
    void onPictureTaken(String path);
}
