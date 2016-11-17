package com.amid88.app.lesson5;

/**
 * Created by dstrashko on 11/17/16.
 */
public class Triangle {

    public static boolean checkRightAngledTriangle(double a, double b, double c){
        if (a > b  &&  a > c) {
            if (a*a == b*b + c*c){
                return true;
            }
            else return false;
        }
        else {
            if (b > a && b > c){
                if (b*b == c*c + a*a){
                    return true;
                }
                else return false;
            }
            else {
                if (c > a && c > b){
                    if (c*c == b*b + a*a){
                        return true;
                    }
                    else return false;
                }
                else return false;
            }

        }

    }

}
