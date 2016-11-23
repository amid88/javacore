package com.amid88.app.homework.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by dstrashko on 11/23/16.
 */
@RunWith(JUnitParamsRunner.class)
public class CircleTest {

    @Test
    public void circleCreateObjectTest(){
        Circle circle = new Circle();
    }

    @Test
    @FileParameters(value = "src/test/resources/Menu/testDataCircleCalculateSquare.csv",
            mapper = CsvWithHeaderMapper.class)
    public void calculateCircleAreaTest(double argA, double expOut){
        Assert.assertEquals(expOut, Circle.calculateSquare(argA), 0.0001);
    }

    @Test
    @FileParameters("src/test/resources/Menu/testDataCircleFirst.csv")
    public void comparisonCircleAreaFirst(double argA, double argB, String expOut){
        Assert.assertTrue(Circle.comparisonSquare(argA, argB).equals(expOut));
    }


}
