package com.amid88.app.homework.lesson9;

import java.util.Arrays;

/**
 * Created by dstrashko on 12/6/16.
 */
public class MultiplyArray {


    public static int[] bubbleSortAscending(int[] inputArray){
        int tempArrayElement = 0;

        for(int i = 0; i < inputArray.length; i++){
            for (int j = 0; j < inputArray.length - 1; j++){
                if (inputArray[j] > inputArray[j+1] ){
                    inputArray[j+1] = tempArrayElement;
                    inputArray[j+1] = inputArray[j];
                    inputArray[j] = tempArrayElement;
                }

            }
            i++;
        }
        return inputArray;
    }

    public static int[] bubbleSortDescending(int[] inputArray){
        int tempArrayElement = 0;

        for(int i = 0; i < inputArray.length; i++){
            for (int j = 0; j > inputArray.length - 1; j++){
                if (inputArray[j] > inputArray[j+1] ){
                    inputArray[j+1] = tempArrayElement;
                    inputArray[j+1] = inputArray[j];
                    inputArray[j] = tempArrayElement;
                }

            }
            i++;
        }
        return inputArray;
    }

    public static int[] selectionSortAscending(int[] inputArray){

        for (int i = 0; i < inputArray.length; i++){

            int maxIndex = i;
            for (int j = 0; j < inputArray.length; j++){
                if (inputArray[j] < inputArray[maxIndex] ){
                    maxIndex = j;
                }

            }
            if (i != maxIndex) {
                int temp = inputArray[i];
                inputArray[i] = inputArray[maxIndex];
                inputArray[maxIndex] = temp;
            }


        }
        return inputArray;

    }

    public static int[] selectionSortDescending(int[] inputArray){

        for (int i = 0; i < inputArray.length; i++){

            int minIndex = i;
            for (int j = 0; j < inputArray.length; j++){
                if (inputArray[j] > inputArray[minIndex] ){
                    minIndex = j;
                }

            }
            if (i != minIndex) {
                int temp = inputArray[i];
                inputArray[i] = inputArray[minIndex];
                inputArray[minIndex] = temp;
            }


        }
        return inputArray;

    }

    public static void printIntArray(int[] inputArray){
        System.out.println(Arrays.toString(inputArray));

    }

}
