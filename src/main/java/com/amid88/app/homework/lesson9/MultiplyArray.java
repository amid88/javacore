package com.amid88.app.homework.lesson9;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by dstrashko on 12/6/16.
 */
public class MultiplyArray {

    public static int maxElementOfMatrix;


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

    public static void printIntMatrix(int[][] inputMatrix) {
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                System.out.printf("%4d", inputMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] printRandomMatrix(){
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

    public static void multiplyTable(int numberOfStudents){

        int[] a = new int[numberOfStudents];
        int[] b = new int[numberOfStudents];
        int[] res = new int[numberOfStudents];


        /*while (res[numberOfStudents - 1] == 0){

            a[i] = ThreadLocalRandom.current().nextInt(2,9);
            b[i] = ThreadLocalRandom.current().nextInt(2,9);


            int mark = 0;
            for(int j = 0; j < i; j++){
                if ((b[j] != a[i]) && (a[j] != b[i])){
                }else mark = 1;
            }
            if (mark == 0) {
                res[i] = a[i] * b[i];
                i++;
            }


        }

        for (int k = 0; k < res.length; k++){
            System.out.println(a[k] + " * " + b[k] + " = " + res[k]);

        }*/



        int i,j;
        for(i = 0; i < numberOfStudents; i++){
            a[i] = ThreadLocalRandom.current().nextInt(2,9);
            b[i] = ThreadLocalRandom.current().nextInt(2,9);
  if(i>0) {
      for (j = i - 1; j >= 0; j--) {
          //System.out.println("j= "+j+"("+a[j] + " , " + b[j]+")");
          while (((a[i] == a[j]) && (b[i] == b[j])) || ((a[i] == b[j]) && (b[i] == a[j]))) {
              a[i] = ThreadLocalRandom.current().nextInt(2, 9);
              b[i] = ThreadLocalRandom.current().nextInt(2, 9);
              System.out.println("i = "+i+" j= "+j+" ("+a[j] + " , " + b[j]+")");
              j=i-1;
          }
      }
  }
            res[i] = a[i] * b[i];

            System.out.println(a[i] + " * " + b[i] + " = " + res[i]);
        }





    }

}
