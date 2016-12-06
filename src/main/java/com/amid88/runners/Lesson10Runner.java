package com.amid88.runners;

import com.amid88.app.classwork.lesson10.Strings;

import java.util.Arrays;

/**
 * Created by dmitriy on 06.12.16.
 */
public class Lesson10Runner {

    public static void main(String[] args) {

        char[] arrayToString = {'a', 'b', 'c', 'd'};
        String stringToDisplay = new String();


        System.out.println(Strings.convertCharToString(arrayToString));
        stringToDisplay = Strings.convertCharToString(arrayToString).replace(" ", ", ");
        System.out.println(Arrays.toString(arrayToString).replace("a", "b"));

        int a = 886;
        double d =665.999;
        char c = 'h';

        String string = String.valueOf(d);

        System.out.println(string);


        int intA = 45;
        String intToString = String.valueOf(intA);
        System.out.println(Integer.parseInt(intToString));

        double doubleA = 445.656;
        String doubleToString = String.valueOf(doubleA);
        System.out.println(Double.parseDouble(doubleToString));

        long longA = 4353463L;
        String longToDouble = String.valueOf(longA);
        System.out.println(Long.parseLong(longToDouble));

        boolean boolA = true;
        String boolToString = String.valueOf(boolA);
        System.out.println(Boolean.parseBoolean(boolToString));
    }
}
