package com.amid88.app.homework.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by dstrashko on 11/23/16.
 */
@RunWith(JUnitParamsRunner.class)
public class NumberTest {

    @Test
    public void numberCreateObjectTest(){
        Number number = new Number();
    }

    @Test
    @FileParameters("src/test/resources/Menu/testDataEvenNumber.csv")
    public void evenNumberTest(int argA, String expOut){
        Assert.assertTrue(com.amid88.app.homework.lesson6.Number.evenNumber(argA).equals(expOut));
    }

    @Test
    @FileParameters("src/test/resources/Menu/testDataCompereNumbers.csv")
    public void compareNumbersTest(int argA, int argB, String expOut){
        Assert.assertEquals(Number.compareNumbers(argA, argB), expOut);
    }

}
