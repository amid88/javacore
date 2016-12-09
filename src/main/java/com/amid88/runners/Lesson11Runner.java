package com.amid88.runners;

import com.amid88.app.classwork.lesson11.StringSplit;

/**
 * Created by dmitriy on 09.12.16.
 */
public class Lesson11Runner {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splitArray = inputString.split(" ");



        for (int i = 0; i < splitArray.length; i++){
            System.out.print(splitArray[i] + "; ");
        }*/

        /*StringBuilder builder = new StringBuilder("start");
        int startInclusive = 2;
        int endExclusive = 4;
        int indexOffset = 2;

        builder.delete(startInclusive, endExclusive);
        System.out.println(builder);

        builder.insert(indexOffset, "some text to paste");
        System.out.println(builder.toString());*/


        char[] chars = {'a','b','c','d','e'};
        StringBuilder stringBuilder = new StringBuilder();

        for(int i =0; i < chars.length; i++){
            stringBuilder.append(chars[i]);
        }
        System.out.println(stringBuilder.toString());


        String polindrome = "moomrr";
        StringBuilder polindromeReverse = new StringBuilder(polindrome);

        if (polindrome.equals(polindromeReverse.reverse().toString())) System.out.println("yes");
        else System.out.println("no");


        System.out.println(StringSplit.stringEncode("AB"));









    }
}
