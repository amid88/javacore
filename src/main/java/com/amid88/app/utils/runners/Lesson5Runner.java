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

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Number number = new Number();

        //Calculating and displaying Circle by its radius
        System.out.println("Please enter circle radius");
        Scanner scanner = new Scanner(System.in);
        Double radius = scanner.nextDouble();
        Double square = circle.calculateSquare(radius);
        System.out.println("The circle square is " + square);

        //Calculating the bigger circle by their area
        System.out.println("Please enter radius of circle_1");
        Scanner scannerCircle1 = new Scanner(System.in);
        Double radius1 = scannerCircle1.nextDouble();
        System.out.println("Please enter radius of circle_2");
        Scanner scannerCircle2 = new Scanner(System.in);
        Double radius2 = scannerCircle2.nextDouble();
        circle.comparisonSquare(radius1, radius2);

        //Checking if triangle is right-angled
        System.out.println("Please enter the first side of triangle(a)");
        Scanner scannerSideA = new Scanner(System.in);
        Double a = scannerSideA.nextDouble();
        System.out.println("Please enter the second side of triangle(b)");
        Scanner scannerSideB = new Scanner(System.in);
        Double b = scannerSideB.nextDouble();
        System.out.println("Please enter the third side of triangle(c)");
        Scanner scannerSideC = new Scanner(System.in);
        Double c = scannerSideC.nextDouble();
        Boolean rightAngledTriangleFlag = triangle.checkRightAngledTriangle(a, b, c);

        if (rightAngledTriangleFlag == true) {
            System.out.println("Triangle is right-angled");
        }
        else System.out.println("It is not right-angled triangle");


        //Define if number is even or odd
        System.out.println("Please enter the number");
        Scanner scannerNumber = new Scanner(System.in);
        Integer N = scannerNumber.nextInt();
        if (number.evenNumber(N) == true){
            System.out.println("Input number is even");
        }
        else System.out.println("Input number is odd");


        //Define which number is bigger
        System.out.println("Please enter number 1");
        Scanner scannerNumber1 = new Scanner(System.in);
        Integer N1 = scannerNumber1.nextInt();
        System.out.println("Please enter number 1");
        Scanner scannerNumber2 = new Scanner(System.in);
        Integer N2 = scannerNumber2.nextInt();
        System.out.println(number.compareNumbers(N1, N2));










    }
}
