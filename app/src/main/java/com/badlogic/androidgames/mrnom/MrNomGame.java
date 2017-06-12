package com.badlogic.androidgames.mrnom;

import com.badlogic.androidgames.framework.Screen;
import com.badlogic.androidgames.framework.impl.AndroidGame;
import android.util.Log;
public class MrNomGame extends AndroidGame {

    @Override
    public Screen getStartScreen() {
        Log.d("mrnom", "MrNomGame_getStartScreen");
        return new LoadingScreen(this);
    }
}
