package com.amid88.app.lesson5;

import java.util.Scanner;

/**
 * Created by dstrashko on 11/17/16.
 */
public class CircleArea {

    public static double calculate(double radius) {
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }

    public static void calculateBigger (double radius1, double radius2){

        if (calculate(radius1)> calculate(radius2)) {
            System.out.println("Area1 is bigger");
        }
        else {
            System.out.println("Area2 is bigger");
        }


    }
}
