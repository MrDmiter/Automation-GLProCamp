package com.xpath.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class seleniumTest {
    private WebDriver driver;

    /**
     * Method includes configuration of the tests
     */
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    /**
     * Test which takes two prices form the page, minus one from another and show result in the console
     */
    @Test
    public void testComparePhonePrice() {
        driver.get("https://supsystic.com/example/comparison-example/");
        String actualPrice = driver.findElement(By.xpath("//span[.='Samsung Galaxy S6']/ancestor::div[contains(@class, 'ptsElWithArea')]//div[@class='ptsCell']//span[contains(., '$')]")).getAttribute("textContent");
        System.out.println("Actual price is - " + actualPrice);
        String crossedPrice = driver.findElement(By.xpath("//div[@data-el='table_col'][3]/descendant::div[@class='ptsColFooter']/div/p/span")).getAttribute("textContent");
        System.out.println("Crossed price is - " + crossedPrice);
        int actualPriceInt = Integer.parseInt(actualPrice.substring(1, 4));
        int crossedPriceInt = Integer.parseInt(crossedPrice.substring(1, 5));
        System.out.println(crossedPriceInt - actualPriceInt);
    }

    /**
     * Test which find particular letter in the table of unicodes and show it in the console
     */
    @Test
    public void testUnicode() {
        driver.get("https://unicode-table.com/ru/");
        String qLetter = driver.findElement(By.xpath("//li[contains(text(),'Q')]")).getText();
        System.out.println(qLetter);
        String andLetter = driver.findElement(By.xpath("//li[contains(text(),'&')]")).getText();
        System.out.println(andLetter);
        String aLetter = driver.findElement(By.xpath("//li[@class='symb'][contains(text(),'A')]")).getText();
        System.out.println(aLetter);
    }


    /**
     * Close browser
     */
    @After
    public void tearDown() {
        driver.quit();
    }
}
