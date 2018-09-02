package com.example.gangadhar.customview;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

public class LifecycleAwareLogging implements LifecycleObserver {
    private final String TAG = LifecycleAwareLogging.class.toString();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private void listeningToOncreate() {
        Log.d(TAG, "on create");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private void listeningToOnstart() {
        Log.d(TAG, "on start");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void listeningToOnresume() {
        Log.d(TAG, "on resume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void listeningToOnpause() {
        Log.d(TAG, "on pause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void listeningToOnstop() {
        Log.d(TAG, "on stop");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void listeningToOndestroy() {
        Log.d(TAG, "on destroy");
    }
}
