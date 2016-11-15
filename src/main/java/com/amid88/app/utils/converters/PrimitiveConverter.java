package com.amid88.app.utils.converters;

import sun.font.TrueTypeFont;

/**
 * Created by dstrashko on 11/15/16.
 */
public class PrimitiveConverter {

    public void floatToChar(float f){
        char c;
        c = (char)f;
        System.out.println("Input float value is " + f + ". Output char value is " + c);
    }

    public void intToChar(int i){
        char c;
        c = (char)i;
        System.out.println("Input int value is " + i + ". Output char value is " + c);
    }

    public void charToInt(char c){
        int i;
        i = (int)c;
        System.out.println("Input char value is " + c + ". Output int value is " + i);
    }



}
