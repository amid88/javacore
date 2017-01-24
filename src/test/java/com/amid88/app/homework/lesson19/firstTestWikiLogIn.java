package com.amid88.app.homework.lesson19;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class firstTestWikiLogIn {
    FirefoxDriver wd;
    
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "/home/dstrashko/KIT/JavaProjects/javacore/GeckoDriver/geckodriver");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void firstTestWikiLogIn() {
        wd.get("https://www.wikipedia.org/");
        wd.findElement(By.xpath("//a[@id='js-link-box-en']//strong[.='English']")).click();
        //wd.findElement(By.linkText("Log in")).click();
        wd.findElement(By.xpath(".//*[@id='pt-login']/a")).click();
        wd.findElement(By.id("wpName1")).click();
        wd.findElement(By.id("wpName1")).clear();
        wd.findElement(By.id("wpName1")).sendKeys("test");
        wd.findElement(By.id("wpPassword1")).click();
        wd.findElement(By.id("wpPassword1")).clear();
        wd.findElement(By.id("wpPassword1")).sendKeys("123");
        wd.findElement(By.xpath("//label[@for='wpRemember']")).click();
        if (!wd.findElement(By.id("wpRemember")).isSelected()) {
            wd.findElement(By.id("wpRemember")).click();
        }
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
