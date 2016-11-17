package com.amid88.app.utils.runners;

import com.amid88.app.lesson5.Triangle;
import com.amid88.app.lesson5.CircleArea;

import java.util.Scanner;

/**
 * Created by dstrashko on 11/17/16.
 */
public class Lesson5Runner {

    public static void main(String args[]) {

        CircleArea circleArea = new CircleArea();
        Triangle triangle = new Triangle();

        //Calculating and displaying CircleArea by its radius
        System.out.println("Please enter circle radius");
        Scanner scanner = new Scanner(System.in);
        Double radius = scanner.nextDouble();
        Double Area = circleArea.calculate(radius);
        System.out.println("Area is " + Area);

        //Calculating the bigger circle by their area
        System.out.println("Please enter radius of circle_1");
        Scanner scannerCircle1 = new Scanner(System.in);
        Double radius1 = scannerCircle1.nextDouble();
        System.out.println("Please enter radius of circle_2");
        Scanner scannerCircle2 = new Scanner(System.in);
        Double radius2 = scannerCircle2.nextDouble();
        circleArea.calculateBigger(radius1,radius2);

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








    }
}
