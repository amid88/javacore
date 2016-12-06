package com.amid88.runners;

import java.util.Arrays;

/**
 * Created by dmitriy on 02.12.16.
 */
public class Lesson9Runner {
    public static void main (String args[]){
        //MultiplyArray.bubbleSortArrayDescending();
        //MultiplyArray.bubbleSortArrayAscending();

        int[] someArray = {1, 5, 7, 2, 0};
        Arrays.sort(someArray);

        System.out.println("Sorted array:" + Arrays.toString(someArray));

    }
}
