package com.amid88.app.classwork.lesson19;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WikiTest {
    FirefoxDriver wd;
    
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "/home/dmitriy/Kit/javacore/GeckoDriver/geckodriver");
        WebDriver wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void WikiTest() {
        wd.get("https://www.wikipedia.org/");
        wd.findElement(By.xpath("//a[@id='js-link-box-en']//strong[.='English']")).click();
        wd.findElement(By.linkText("Create account")).click();
        wd.findElement(By.id("wpName2")).click();
        wd.findElement(By.id("wpName2")).clear();
        wd.findElement(By.id("wpName2")).sendKeys("Jack123");
        wd.findElement(By.id("wpPassword2")).click();
        wd.findElement(By.id("wpPassword2")).clear();
        wd.findElement(By.id("wpPassword2")).sendKeys("123");
        wd.findElement(By.id("wpRetype")).click();
        wd.findElement(By.id("wpRetype")).clear();
        wd.findElement(By.id("wpRetype")).sendKeys("123");
        wd.findElement(By.id("wpEmail")).click();
        wd.findElement(By.id("wpEmail")).clear();
        wd.findElement(By.id("wpEmail")).sendKeys("jack123@gmail.com");
        wd.findElement(By.id("mw-input-captchaWord")).click();
        wd.findElement(By.id("mw-input-captchaWord")).clear();
        wd.findElement(By.id("mw-input-captchaWord")).sendKeys();
        wd.findElement(By.cssSelector("div.fancycaptcha-captcha-container")).click();
        wd.findElement(By.id("wpCreateaccount")).click();
        wd.findElement(By.id("mw-input-captchaWord")).click();
        wd.findElement(By.id("mw-input-captchaWord")).clear();
        wd.findElement(By.id("mw-input-captchaWord")).sendKeys("111");
        wd.findElement(By.id("wpCreateaccount")).click();
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
