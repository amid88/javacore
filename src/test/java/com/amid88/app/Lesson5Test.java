package com.amid88.app;

import com.amid88.app.lesson5.Circle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dstrashko on 11/18/16.
 */
public class Lesson5Test {

    @Test
    public void circleCalculateSquareTest(){
        double radius = 10;
        double result = Math.PI * radius * radius;
        Circle.calculateSquare(radius);
        Assert.assertArrayEquals(Circle.calculateSquare(), result);


    }
}
