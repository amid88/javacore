package com.amid88.app.lesson5;



/**
 * Created by dstrashko on 11/17/16.
 */
public class Circle {

    public static double calculateSquare(double radius) {
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }

    public static void comparisonSquare (double radius1, double radius2){

        if (calculateSquare(radius1)> calculateSquare(radius2)) {
            System.out.println("The square of circle_1 is bigger");
        }
        else {
            System.out.println("The square of circle_2 is bigger");
        }


    }
}
