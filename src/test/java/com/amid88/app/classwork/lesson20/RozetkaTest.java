package com.amid88.app.classwork.lesson20;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void titleTest(){
        driver.get("https://rozetka.com.ua");
        By title = By.xpath("//title");
        String titleExpected = "Интернет-магазин ROZETKA™: фототехника, видеотехника, аудиотехника, компьютеры и компьютерные комплектующие";
        assertEquals(titleExpected, driver.findElement(title).getAttribute("innerHTML"));
    }

    @Test
    public void searchElementTest(){
        driver.get("https://rozetka.com.ua");

        driver.findElementByXPath("//*[@id='rz-search']/form/div[1]/div[2]/input").click();
        driver.findElementByXPath("//*[@id='rz-search']/form/div[1]/div[2]/input").sendKeys("iphone");
        driver.findElementByXPath("//*[@id='rz-search']/form/div[1]/div[2]/input").sendKeys(Keys.RETURN);

        String nameActual = driver.findElementByXPath(".//*[@id='title_page']/div/div/div[2]/h1").getText();
        assertEquals(nameActual, "Мобильные телефоны Apple" );

    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
