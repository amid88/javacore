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
    @FileParameters(value = "src/test/resources/testdata.csv",
    mapper = CsvWithHeaderMapper.class)

    public void dataProviderTestAdd(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFunctions.multiply(argA, argB));
    } //make sure that variables are in same order and types as in csv file


    @Test
    public void multiplyTest() {
        Assert.assertEquals(6, MathFunctions.multiply(2,3));
    }

    @Test
    public void subtractionTest() {
        int res = MathFunctions.subtraction(5, 2);
        Assert.assertEquals(res, 3);

    }

}