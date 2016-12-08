package com.amid88.runners;

import com.amid88.app.homework.lesson9.MultiplyArray;

/**
 * Created by dstrashko on 12/8/16.
 */
public class Lesson9Runner {

    public static void main(String[] args) {


        MultiplyArray.printIntMatrix(MultiplyArray.printRandomMatrix());
        System.out.println("Te maximum element of matrix is: " + MultiplyArray.maxElementOfMatrix);

        MultiplyArray.multiplyTable(15);


    }
}
