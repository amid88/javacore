package com.amid88.app.homework.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by dstrashko on 11/18/16.
 */
@RunWith(JUnitParamsRunner.class)
public class HW_5Test {

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

    @Test
    @FileParameters("src/test/resources/Menu/testDataEvenNumber.csv")
    public void evenNumberTest(int argA, String expOut){
        Assert.assertTrue(com.amid88.app.homework.lesson5.Number.evenNumber(argA).equals(expOut));
    }

    @Test
    public void circleCreateObjectTest(){
        Circle circle = new Circle();
    }

    @Test
    public void numberCreateObjectTest(){
        Number number = new Number();
    }

    @Test
    @FileParameters("src/test/resources/Menu/testDataCompereNumbers.csv")
    public void compareNumbersTest(int argA, int argB, String expOut){
        Assert.assertEquals(Number.compareNumbers(argA, argB), expOut);
    }

    @Test
    @FileParameters("src/test/resources/Menu/testDataTriangle.csv")
    public void checkRightAngledTriangleTest(int argA, int argB, int argC, String expOut){
        Assert.assertEquals(Triangle.checkRightAngledTriangle(argA, argB, argC), expOut);
    }

}
