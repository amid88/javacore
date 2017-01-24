package com.amid88.app.homework.lesson19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by dstrashko on 1/24/17.
 */
public class firstTestWikiLoginWithGecko {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/home/dstrashko/KIT/JavaProjects/javacore/GeckoDriver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.toolsqa.com");

        Thread.sleep(5000);
        driver.quit();
    }

}
