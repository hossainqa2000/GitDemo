package com.basePack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    protected static WebDriver driver;

    @BeforeTest
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver=(WebDriver) new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().Du(20, TimeUnit.SECONDS);
    }

    @AfterTest
    public void teardown() {
        driver.close();
        driver.quit();
    }
}
