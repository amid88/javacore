package com.amid88.app.homework.lesson6;

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
public class TriangleTest {


    @Test
    public void triangleCreateObjectTest(){
        Triangle triangle = new Triangle();
    }

    @Test
    @FileParameters(value = "src/test/resources/Menu/testDataTriangle.csv",
    mapper = CsvWithHeaderMapper.class)
    public void checkRightAngledTriangleTest(int argA, int argB, int argC, String expOut){
        Assert.assertEquals(Triangle.checkRightAngledTriangle(argA, argB, argC), expOut);
    }

}
