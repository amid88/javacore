package com.amid88.app.classwork.lesson11;

/**
 * Created by dmitriy on 09.12.16.
 */
public class StringSplit {

    public static String stringEncode (String stringToEncode){
        String plainedText = "ABCDEFGHKL";
        String cypherText =  "0123456789";
        StringBuilder stringBuilder = new StringBuilder(stringToEncode);


        for (int i = 0; i < stringBuilder.length(); i++){
            for (int j = 0; j < plainedText.length(); j++){
                if (stringBuilder.charAt(i) == plainedText.charAt(j)){
                    stringBuilder.setCharAt(i, cypherText.charAt(j));
                    break;
                }
            }
        }
        return stringBuilder.toString();



    }

}
