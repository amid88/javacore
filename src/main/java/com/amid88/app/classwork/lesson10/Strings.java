package com.amid88.app.classwork.lesson10;

/**
 * Created by dmitriy on 06.12.16.
 */
public class Strings {


    public static String convertCharToString(char[] value){

        String stringToDisplay = "";

        for (int i = 0; i < value.length; i++){
            stringToDisplay += value[i] + " ";
        }
        return stringToDisplay;

    }
}
