package com.example.gangadhar.customview;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;

public class MusicObserver implements LifecycleObserver {
    private Context mContext;
    private MusicManager mMusicManager;

    private MusicManager getMusicManager() {
        if (mMusicManager == null) {
            mMusicManager = new MusicManager(mContext);
        }
        return mMusicManager;
    }

    public MusicObserver(Context context) {
        this.mContext = context;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void startMusic() {
        getMusicManager().start();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pauseMusic() {
        getMusicManager().pause();

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resumeMusic() {
        getMusicManager().start();

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void stopMusic() {
        getMusicManager().stop();
    }
}
