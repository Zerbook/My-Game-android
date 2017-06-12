package com.badlogic.androidgames.mrnom;

import android.util.Log;

public class Stain {
    public static final int TYPE_1 = 0;
    public static final int TYPE_2 = 1;
    public static final int TYPE_3 = 2;
    public int x, y;
    public int type;

    public Stain(int x, int y, int type) {
        Log.d("mrnom", "Stain_Stain");
        this.x = x;
        this.y = y;
        this.type = type;
    }
}