package com.amid88.app.homework.lesson7;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by dstrashko on 11/28/16.
 */
public class Array {

    public static void arrayPrintOutEvenNumbers(){
        int[] evenArray = new int[10];
        int argA = 2;
        int argB = 20;

        //creating the array of even numbers where argA - first element, argB - last element
        for (int i = 0; argA <= argB; i++){
            evenArray[i] = argA;
            argA +=2;
        }

        //evenArray output: all elements in one string
        for (int arrElement : evenArray){
            System.out.print(arrElement + " ");
        }

        //evenArray output: each element in new line
        for (int arrElement : evenArray){
            System.out.print("\n" + arrElement);
        }
    }

    public static void arrayPrintOutOddNumbers(){
        int[] oddArray = new int[50];
        int argA = 1;
        int argB = 99;

        for (int i = 0; argA <= argB; i++ ){
            oddArray[i] = argA;
            argA+=2;
        }

        //oddArray output: from small to high order
        for (int i = 0; i < oddArray.length; i++){
            System.out.print(oddArray[i] + " ");
        }

        System.out.print("\n");

        //oddArray output: from small to high order
        for (int i = oddArray.length - 1; i >= 0; i--){
            System.out.print(oddArray[i] + " ");
        }

    }

    public static void calculateEvenOddNumbers(){
        int[] array = new int[15];
        int evenCounter = 0;
        Random randomGenerator = new Random();


        //generate array of random numbers
        for (int i =0; i < array.length; i++){
            array[i] = randomGenerator.nextInt(9);
        }

        //printOut array on the screen
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        //calculating even numbers in array
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                evenCounter++;
            }
        }
        System.out.print("\nThe amount of even numbers is: " + evenCounter);

        }

    public static void calculateMinMaxOfArray(){
        int[] array = new int[15];
        Random randomGenerator = new Random();

        //generate array of random numbers
        for (int i = 0; i < array.length; i++){
            array[i] = randomGenerator.nextInt(999);
        }

        //calculate Min and Max elements of Array
        int minElementOfArray = array [0];
        int maxElementOfArray = array [0];
        for (int i = 0; i < array.length; i++){
            if (array[i] >= maxElementOfArray){ maxElementOfArray = array[i];}
            if (array[i] <= minElementOfArray){ minElementOfArray = array[i];}
        }

        //printOut array on the screen
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("\nMax element of array is: " + maxElementOfArray);
        System.out.print("\nMin element of array is: " +minElementOfArray);

    }

    public static void randomMatrix(){
        int[][] matrix = new int[8][5];

        //
        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix[0].length; j++ ){
                matrix[i][j] = ThreadLocalRandom.current().nextInt(10, 99);
                }
        }

        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix[0].length; j++ ){
                System.out. print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void randomMatrixWithAlignment(){
        int[][] matrix = new int[8][5];

        //
        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix[0].length; j++ ){
                matrix[i][j] = ThreadLocalRandom.current().nextInt(10, 999);
            }
        }

        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix[0].length; j++ ){
                System.out. printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void sumOfElements(){
        boolean flag = true;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        while (flag == true) {
            System.out.println("Enter the number or type 'exit' to stop input and see the sum of all numbers");
            String stringInput = scanner.nextLine();

            if (isParsable(stringInput)){
                sum += Integer.parseInt(stringInput);
            }
            else {
                if (stringInput.equals("exit")){
                    flag = false;
                }
                else {
                    System.out.println("Wrong input");
                }
            }
        }
        System.out.println("The sum of all elements is: " + sum);
    }

    public static boolean isParsable(String input){
        boolean parsable = true;
        try{
            Integer.parseInt(input);
        }catch(NumberFormatException e){
            parsable = false;
        }
        return parsable;
    }

}
