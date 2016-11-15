package com.amid88.app;
import com.amid88.app.utils.converters.PrimitiveConverter;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by dstrashko on 11/15/16.
 */
public class ConverterTest {

    @Test
    public void intToCharCastingTest(){

        PrimitiveConverter converter = new PrimitiveConverter();
        converter.charToInt();
        assertTrue(converter.charToInt('$') instanceof Int);

        //Assert.assertTrue(PrimitiveConverter.);


    }


}
