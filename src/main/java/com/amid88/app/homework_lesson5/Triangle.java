package com.amid88.app.homework_lesson5;

/**
 * Created by dstrashko on 11/17/16.
 */
public class Triangle {

    public static String checkRightAngledTriangle(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0) {
            if (a > b && a > c) {
                if (a * a == b * b + c * c) {
                    return "Triangle is right-angled";
                } else return "It is not right-angled triangle";
            } else {
                if (b > a && b > c) {
                    if (b * b == c * c + a * a) {
                        return "Triangle is right-angled";
                    } else return "It is not right-angled triangle";
                } else {
                    if (c > a && c > b) {
                        if (c * c == b * b + a * a) {
                            return "Triangle is right-angled";
                        } else return "It is not right-angled triangle";
                    } else return "It is not right-angled triangle";
                }

            }
        }
        else return "It is not right-angled triangle";

    }

}
