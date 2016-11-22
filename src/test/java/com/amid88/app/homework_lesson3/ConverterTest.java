package com.amid88.app.homework_lesson3;
import com.amid88.app.homework.lesson3.PrimitiveConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dstrashko on 11/15/16.
 */
public class ConverterTest {

    @Test
    public void charToIntCastingTest(){
        PrimitiveConverter converter = new PrimitiveConverter();
        assertEquals(converter.charToInt('*'), 42);
    }

    @Test
    public void intToCharCastingTest(){
        PrimitiveConverter converter = new PrimitiveConverter();
        assertEquals(converter.intToChar(37), '%');
    }

    @Test
    public void floatToCharCastingTest(){
        PrimitiveConverter converter = new PrimitiveConverter();
        assertEquals(converter.floatToChar(45F), '-');

    }




}
