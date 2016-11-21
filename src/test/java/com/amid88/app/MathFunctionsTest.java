package com.amid88.app;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class MathFunctionsTest {

    @Test
    @FileParameters(value = "src/test/resources/Math/testDataMultiply.csv",
    mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFunctions.multiply(argA, argB));
    } //make sure that variables are in same order and types as in csv file


    @Test
    @FileParameters(value = "src/test/resources/Math/testDataSubtraction.csv",
    mapper = CsvWithHeaderMapper.class)
    public void subtractionTest(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFunctions.subtraction(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/Math/testDataSum.csv",
    mapper = CsvWithHeaderMapper.class)
    public void sumTest(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFunctions.sum(argA, argB));

    }

}