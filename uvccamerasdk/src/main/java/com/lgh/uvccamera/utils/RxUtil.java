package com.lgh.uvccamera.utils;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
/**
 * <pre>
 *     @author : liudongbing
 *     @e-mail : lvdongbing@orbbec.com
 *     @time   : 2020/2/28
 *     @desc   : RxJava 工具类
 *     version: 1.0
 * </pre>
 */
public class RxUtil {

    public static <T> Observable.Transformer<T, T> io_main() {
        return new Observable.Transformer() {
            @Override
            public Object call(Object observable) {
                return ((Observable) observable)
                        .subscribeOn(Schedulers.io())
                        .unsubscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

    public static void unsubscribe(Subscription subscription) {
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }

}
