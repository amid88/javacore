package com.amid88.runners.homework;

import com.amid88.app.classwork.lesson7.Loops;

/**
 * Created by dmitriy on 25.11.16.
 */
public class Lesson7Runner {

    public static void main(String args[]){
        //Loops.counterWhile(4,2);
        //Loops.counterFor(1,10);
        int a = 1;
        /*System.out.println("Original a value = " + a);
        System.out.println("Post-increment a = " + a++);
        System.out.println("After post-increment = " + a);
        System.out.println("Pre-increment a = " + ++a);
        System.out.println("After pre-increment = " + a);*/

        System.out.println(Loops.counterForEven());
        int[] intArray = {1, 2, 3};
        for (int i = 0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

        //for each loop
        for (int arrElement : intArray){
            System.out.println(arrElement);

        }
    }
}
