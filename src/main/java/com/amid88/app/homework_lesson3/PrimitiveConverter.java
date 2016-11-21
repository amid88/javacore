package com.amid88.app.homework_lesson3;

/**
 * Created by dstrashko on 11/15/16.
 */
public class PrimitiveConverter {

    public char floatToChar(float f){
        char c;
        c = (char)f;
        System.out.println("Input float value is " + f + ". Output char value is " + c);
        return c;
    }

    public char intToChar(int i){
        char c;
        c = (char)i;
        System.out.println("Input int value is " + i + ". Output char value is " + c);
        return c;
    }

    public int charToInt(char c){
        int i;
        i = (int)c;
        System.out.println("Input char value is " + c + ". Output int value is " + i);
        return i;
    }




}
