package com.badlogic.androidgames.framework;

import android.media.MediaPlayer;

public interface Music extends MediaPlayer.OnCompletionListener {
    public void play();
    public void stop();
    public void pause();
    public void setLooping(boolean looping);
    public void setVolume(float volume);
    public boolean isPlaying();
    public boolean isStopped();
    public boolean isLooping();
    public void dispose();
}