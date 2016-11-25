package com.amid88.app.classwork.lesson7;

/**
 * Created by dmitriy on 25.11.16.
 */
public class Loops {



    public static void counterWhile(int a, int b){

        while (a > b){
            System.out.println("a = " + a + ", b = " + b);
            a--;

        }
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void counterFor(int a, int b){
        for (int i = a; i <= b; i++){
            System.out.print(i + " ");
        }
    }

    public static int counterForEven(){
        int count = 0;
        for (int i = 0; i <= 20; i+=2){
            count++;
        }
        return count;
    }

}
