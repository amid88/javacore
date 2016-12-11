package com.amid88.app.homework.lesson9;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by dstrashko on 12/6/16.
 */
public class MultiplyArray {

    public static int maxElementOfMatrix;


    public static int[] bubbleSortAscending(int[] inputArray){

        int tempArrayElement;

        for(int i = 0; i < inputArray.length; i++){
            for (int j = 0; j < inputArray.length - 1; j++){
                if (inputArray[j] > inputArray[j+1] ){
                    tempArrayElement = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = tempArrayElement;
                }

            }
        }
        return inputArray;
    }




    public static int[] bubbleSortDescending(int[] inputArray){
        int tempArrayElement;

        for(int i = 0; i < inputArray.length; i++){
            for (int j = 0; j < inputArray.length - 1; j++){
                if (inputArray[j] < inputArray[j+1] ){
                    tempArrayElement = inputArray[j+1];
                    inputArray[j+1] = inputArray[j];
                    inputArray[j] = tempArrayElement;
                }

            }
        }
        return inputArray;
    }

    public static int[] selectionSortAscending(int[] inputArray){

        for (int i = 0; i < inputArray.length; i++){

            int maxIndex = i;
            for (int j = i + 1; j < inputArray.length; j++){
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
            for (int j = i + 1; j < inputArray.length; j++){
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

    public static void printArray(int[] inputArray){
        System.out.println(Arrays.toString(inputArray));

    }

    public static void printArray(int[][] inputArray){
        for(int i = 0; i < inputArray.length; i++){
            for(int j = 0; j < inputArray[0].length; j++ ){
                System.out. printf("%4d", inputArray[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] generateRandomMatrix(){
        int[][] randomMatrix = new int[5][8];
        maxElementOfMatrix = randomMatrix[0][0];
        for(int i = 0; i < randomMatrix.length; i++){
            for (int j = 0; j < randomMatrix[0].length; j++){
                randomMatrix[i][j] = ThreadLocalRandom.current().nextInt(-99, 99);
                if (randomMatrix[i][j] >= maxElementOfMatrix){
                    maxElementOfMatrix = randomMatrix[i][j];
                }
            }
        }
        return randomMatrix;
    }

    public static int[][] multiplicationTable(int numberOfStudents){
        int[][] resMatrix = new int[3][numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            resMatrix[0][i] = ThreadLocalRandom.current().nextInt(2, 9);
            resMatrix[1][i] = ThreadLocalRandom.current().nextInt(2, 9);
            if (i > 0) {
                for (int j = i - 1; j >= 0; j--) {
                    //System.out.println("j= "+j+"("+a[j] + " , " + b[j]+")");
                    while (((resMatrix[0][i] == resMatrix[0][j]) && (resMatrix[1][i] == resMatrix[1][j])) ||
                            ((resMatrix[0][i] == resMatrix[1][j]) && (resMatrix[1][i] == resMatrix[0][j]))) {
                        resMatrix[0][i] = ThreadLocalRandom.current().nextInt(2, 9);
                        resMatrix[1][i] = ThreadLocalRandom.current().nextInt(2, 9);
                        //System.out.println("i = "+i+" j= "+j+" ("+a[j] + " , " + b[j]+")");
                        j = i - 1;
                    }
                }
            }
            resMatrix[2][i] = resMatrix[0][i] * resMatrix[1][i];
            //System.out.println(resMatrix[0][i] + " * " + resMatrix[1][i] + " = " + resMatrix[2][i]);
        }
        return resMatrix;
    }
}