package com.amid88.app.utils.runners;

import com.amid88.app.lesson5.Circle;
import com.amid88.app.lesson5.Triangle;
import com.amid88.app.lesson5.Number;

import java.util.Scanner;

/**
 * Created by dstrashko on 11/17/16.
 */
public class Lesson5Runner {

    public static void main(String args[]) {

       /* calculatingCircleArea();
        defineBiggerCircle();
        isTriangleRightAngled();
        evenOddNumber();
        biggerNumber();
*/
       menu();
    }

    public static void menu(){

        int parameterFlag = 1;
        do {
            int parameter = scannerInputAny("Welcome to program 'Lesson5'. Please choose one of options below: \n" + "\t"+
                    "1. Right-angled triangle\n" +"\t" +
                    "2. Define which circle is bigger\n" +"\t" +
                    "3. Calculate circle area\n" + "\t" +
                    "4. Define is number odd or even\n" + "\t" +
                    "5. What number is bigger/smaller\n" + "\t" +
                    "0. Exit from the program");
            switch (parameter) {
                case 0: parameterFlag = 0;
                        break;
                case 1:
                    isTriangleRightAngled();
                    break;
                case 2:
                    defineBiggerCircle();
                    break;
                case 3:
                    calculatingCircleArea();
                    break;
                case 4:
                    evenOddNumber();
                    break;
                case 5:
                    biggerNumber();
                    break;
                default:
                    parameterFlag = 1;
                    System.out.println("Wrong input");
                    break;
            }
            } while (parameterFlag != 0);

        }


    public static double scannerInputDouble (String s){
        System.out.println(s);
        Scanner scannerS = new Scanner(System.in);
        return scannerS.nextDouble();
    }

    public static int scannerInputAny (String s){
        System.out.println(s);
        Scanner scannerS = new Scanner(System.in);
        int scannerAny = Integer.parseInt(scannerS.nextLine());
        return scannerAny;
    }

    public static int scannerInputInt (String s) {
        System.out.println(s);
        Scanner scannerS = new Scanner(System.in);
        return scannerS.nextInt();
    }

    public static void calculatingCircleArea() {

        //Calculating and displaying Circle by its radius
        double radius = scannerInputDouble("Please enter circle radius");
        double square = Circle.calculateSquare(radius);
        System.out.println("The circle square is " + square);

    }

    public static void defineBiggerCircle() {

        //Define wich circle has bigger area
        double radius1 = scannerInputDouble("Please enter radius of circle_1");
        double radius2 = scannerInputDouble("Please enter radius of circle_2");
        Circle.comparisonSquare(radius1, radius2);
    }

    public static void isTriangleRightAngled() {

        //Checking if triangle is right-angled
        double a = scannerInputDouble("Please enter the first side of triangle(a)");
        double b = scannerInputDouble("Please enter the second side of triangle(b)");
        double c = scannerInputDouble("Please enter the third side of triangle(c)");
        String result = Triangle.checkRightAngledTriangle(a, b, c);
        System.out.println(result);
    }

    public static void evenOddNumber(){

        //Define if number is even or odd
        int number = scannerInputInt("Please enter the number");
        String result = Number.evenNumber(number);
        System.out.println(result);

    }

    public static void biggerNumber(){

        //Define which number is bigger
        int number1 = scannerInputInt("Please enter number 1");
        int number2 = scannerInputInt("Please enter number 2");
        String result = Number.compareNumbers(number1, number2);
        System.out.println(result);

    }

}
