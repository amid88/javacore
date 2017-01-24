package com.amid88.app.classwork.lesson19;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class WikiFirstTestWithGecko {
    FirefoxDriver wd;
    
    @Before
    public void setUp() throws Exception {
        //System.setProperty("webdriver.gecko.driver", "/home/dmitriy/Kit/javacore/GeckoDriver/geckodriver");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void WikiFirstTestWithGecko() {
        wd.get("https://www.wikipedia.org/");
        wd.findElement(By.cssSelector("h1.central-textlogo")).click();
        wd.findElement(By.xpath("//a[@id='js-link-box-en']//strong[.='English']")).click();
        wd.findElement(By.linkText("Log in")).click();
        wd.findElement(By.id("wpName1")).click();
        wd.findElement(By.id("wpName1")).clear();
        wd.findElement(By.id("wpName1")).sendKeys("test");
        wd.findElement(By.id("wpPassword1")).click();
        wd.findElement(By.id("wpPassword1")).clear();
        wd.findElement(By.id("wpPassword1")).sendKeys("123");
        wd.findElement(By.id("wpLoginAttempt")).click();
        assertEquals("Incorrect password entered. Please try again.", wd.findElement(By.xpath(".//*[@id='userloginForm']/form/div[1]/p")).getText());
    }
    
    @After
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
