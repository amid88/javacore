package com.amid88.app.homework_lesson5;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by dstrashko on 11/18/16.
 */
public class HW_5Test {

    @Test
    public void calculateCircleAreaPositiveTest(){
        double radius = 10.2;
        double expectedResult = Math.PI * radius * radius;
        double actualResult = Circle.calculateSquare(radius);
        Assert.assertEquals(expectedResult, actualResult,0);
    }
    @Ignore
    @Test
    public void comparisonCircleAreaFirst(){
        double radius1 = 5.66;
        double radius2 = 5.661;
        //Assert.asser
    }
}
