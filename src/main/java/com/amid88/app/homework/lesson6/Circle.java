package com.amid88.app.homework.lesson6;



/**
 * Created by dstrashko on 11/17/16.
 */
public class Circle {

    public static double calculateSquare(double radius) {
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }

    public static String comparisonSquare (double radius1, double radius2){

        if (calculateSquare(radius1)> calculateSquare(radius2)) {
            return "The square of circle_1 is bigger";
        }
        else {
            if (calculateSquare(radius1) == calculateSquare(radius2)){
                return "Circle_1 has the same area as circle_2";
            }
            else {
                return "The square of circle_2 is bigger";
            }
            }



    }

}
