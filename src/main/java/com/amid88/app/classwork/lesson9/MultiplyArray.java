package com.amid88.app.classwork.lesson9;

/**
 * Created by dmitriy on 02.12.16.
 */
public class MultiplyArray {
    public static void bubbleSortArrayAscending(){
        int[] array = {3,5,1,10,4,7};
        int tempInt;


        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length-1; j++){
                if (array[j] > array[j+1]) {
                    tempInt = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tempInt;
                    System.out.println("j = " + j + "; array[j] =" + array[j] + "array[j=1]" + array[j+1] + "temInt = " + tempInt);
                }

            }

        }





        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);

        }


    }

    public static void bubbleSortArrayDescending() {
        int[] array = {3, 5, 1, 10, 4, 7};
        int tempInt;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    tempInt = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempInt;
                }
            }

        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);

        }

    }


}
