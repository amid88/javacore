package com.amid88.app.homework_lesson5;

/**
 * Created by dmitriy on 17.11.16.
 */
public class Number {

    public static String evenNumber(int n){
        if (n % 2 == 0){
            return "Input number is even";
        }
        else return "Input number is odd";
    }
    public static String compareNumbers(int n1, int n2){
        if (n1 == n2){
            return "Numbers are equal";
        }
        else {
            if (n1 > n2) {
                return "Number 1 is greater than Number 2";
            } else return "Number 2 is greater than Number 1";
        }
    }



}
