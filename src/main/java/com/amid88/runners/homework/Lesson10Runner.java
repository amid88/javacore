package com.amid88.runners.homework;

import com.amid88.app.homework.lesson7.Array;

import java.util.Scanner;

/**
 * Created by dmitriy on 25.11.16.
 */
public class Lesson10Runner {

    public static void main(String arg[]){

        int parameterFlag = 1;

        do {
            int parameter = scannerInputAny("\nWelcome to program 'Lesson6'. Please choose one of options below: \n" + "\t"+
                    "1. Print out even numbers\n" +"\t" +
                    "2. Print out odd numbers\n" +"\t" +
                    "3. Calculate even/odd numbers\n" + "\t" +
                    "4. Calculate min and max value of array\n" + "\t" +
                    "5. Random matrix\n" + "\t" +
                    "6. Random matrix with alignment to the right\n" + "\t" +
                    "7. Calculating the sum of all input numbers\n" + "\t" +
                    "0. Exit from the program");
            switch (parameter) {
                case 0: parameterFlag = 0;
                    System.out.println("Thank you for using our program. Bye!");
                    break;
                case 1:
                    Array.arrayPrintOutEvenNumbers();
                    break;
                case 2:
                    Array.arrayPrintOutOddNumbers();
                    break;
                case 3:
                    Array.calculateEvenOddNumbers();
                    break;
                case 4:
                    Array.calculateMinMaxOfArray();
                    break;
                case 5:
                    Array.randomMatrix();
                    break;
                case 6:
                    Array.randomMatrixWithAlignment();
                    break;
                case 7:
                    Array.sumOfElements();
                default:
                    parameterFlag = 1;
                    System.out.println("Wrong input");
                    break;
            }
        } while (parameterFlag != 0);


    }

    public static int scannerInputAny (String s) {
        System.out.println(s);
        Scanner scannerS = new Scanner(System.in);
        int scannerAny = Integer.parseInt(scannerS.nextLine());
        return scannerAny;
    }
}
