package com.example.smitald.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by smitald on 4/27/2015.
 */
public class ColorBook {
    String[] mColor = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
 };
    public int getCol() {

        // Button was clicked , lets add new fact
        String col = "";
        Random rand = new Random();
        int rno = rand.nextInt(mColor.length);
        col = mColor[rno];
        int colInt = Color.parseColor(col);
        return colInt;
    }
}
