package com.amid88.runners;

import com.amid88.app.homework.lesson9.MultiplyArray;

/**
 * Created by dstrashko on 12/6/16.
 */
public class Lesson9Runner {
    public static void main(String[] args) {
        int[] intArray = {5, 10, 0, 99, 50, 7, 18};


        MultiplyArray.bubbleSortDescending(intArray);
        MultiplyArray.printIntArray(intArray);


    }


}
