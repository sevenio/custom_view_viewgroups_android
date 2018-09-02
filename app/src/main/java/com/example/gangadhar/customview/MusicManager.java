package com.example.gangadhar.customview;

import android.content.Context;
import android.media.MediaPlayer;

public class MusicManager {
    private Context mContext;
    private MediaPlayer mMediaPlayer;

    private MediaPlayer getMediaPlayer(){
        if(mMediaPlayer == null){
            mMediaPlayer = MediaPlayer.create(mContext, R.raw.audio_of_image);
        }
        return mMediaPlayer;
    }

    public MusicManager(Context context) {
        mContext = context;
    }

    public void start() {
        getMediaPlayer().start();
    }

    public void pause() {
        getMediaPlayer().pause();
    }

    public void stop() {
        getMediaPlayer().stop();
        getMediaPlayer().release();
    }

}
