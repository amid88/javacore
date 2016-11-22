package com.amid88.app.homework_lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Ignore;
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
}
