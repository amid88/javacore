package com.amid88.app.classwork.lesson20;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by dmitriy on 24.01.17.
 */
public class RozetkaTest {

    public FirefoxDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void titleTest(){
        driver.get("https://rozetka.com.ua");
        assertEquals("Интернет-магазин ROZETKA™: фототехника, видеотехника, аудиотехника, компьютеры и компьютерные комплектующие",
                driver.findElementByXPath("//title"));


    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
