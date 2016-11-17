package com.amid88.app;
import com.amid88.app.utils.converters.PrimitiveConverter;
import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.Object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
